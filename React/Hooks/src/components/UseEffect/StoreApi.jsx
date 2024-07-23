import React, { useEffect, useState } from "react";
import Card from "@mui/material/Card";
import CardContent from "@mui/material/CardContent";
import CardMedia from "@mui/material/CardMedia";
import Typography from "@mui/material/Typography";
import { Button, CardActionArea, CardActions } from "@mui/material";
import CircularProgress from "@mui/material/CircularProgress";
import Box from "@mui/material/Box";
import Grid from "@mui/material/Grid";

export const StoreApi = () => {
  const [products, setProducts] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchProductsData = async () => {
      try {
        const response = await fetch(
          "https://api.escuelajs.co/api/v1/products"
        );
        const data = await response.json();

        // Simulamos un retraso
        // await new Promise((resolve) => setTimeout(resolve, 1000));

        setProducts(data);
        setLoading(false);
      } catch (error) {
        console.error("Error al obtener datos: ", error);
        setLoading(false);
      }
    };

    fetchProductsData();

    return () => {};
  }, []);

  return (
    <>
      <h1>Detalle de los productos</h1>
      {loading ? (
        <Box sx={{ display: "flex" }}>
          <CircularProgress />
        </Box>
      ) : (
        <div>
          <Box sx={{ width: "100%" }}>
            <Grid
              container
              spacing={{ xs: 2, md: 3 }}
              columns={{ xs: 4, sm: 8, md: 12 }}
            >
              {products.map((product) => (
                <Grid item xs={4} sm={4} md={3} lg={4} key={product.id}>
                  <Card>
                    <CardActionArea>
                      <CardMedia
                        component="img"
                        height="140"
                        image={product.images[0]}
                        alt={product.title}
                      />
                      <CardContent>
                        <Typography gutterBottom variant="h5" component="div">
                          {product.title}
                        </Typography>
                        <Typography variant="body2" color="text.secondary">
                          {product.description}
                        </Typography>
                      </CardContent>
                    </CardActionArea>
                    <CardActions>
                      <Button size="small" color="primary">
                        Share
                      </Button>
                    </CardActions>
                  </Card>
                </Grid>
              ))}
            </Grid>
          </Box>
        </div>
      )}
    </>
  );
};
