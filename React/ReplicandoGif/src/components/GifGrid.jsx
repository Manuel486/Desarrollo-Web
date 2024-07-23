import React, { useEffect, useState } from 'react'
import { GifItem } from './GifItem'
import { getGifs } from '../helpers/getGifs'
import { Col, Container, Row } from 'react-bootstrap';
import { ImageList, ImageListItem, ImageListItemBar } from '@mui/material';

export const GifGrid = ({ category }) => {

  const [images, setImages] = useState([]);

  const getImages = async() => {
    const newImages = await getGifs( category )
    setImages( newImages );
  }

  useEffect( () => {
    getImages();
  },[]) 

  return (
    <>
      <h3>{category}</h3>
      <ImageList variant="masonry" cols={3} gap={8}>
        {images.map((image) => (
          <ImageListItem  key={image.id}>
            <img
              src={`${image.url}?w=248&fit=crop&auto=format`}
              srcSet={`${image.url}?w=248&fit=crop&auto=format&dpr=2 2x`}
              alt={image.title}
              loading="lazy"
            />
            {/* <ImageListItemBar position='below' title={image.title}/> */}
          </ImageListItem>
        ))}
      </ImageList>
      {/* <Container>
        <Row>
          {images.map((image) => (
            <Col key={image.id} md={3}>
              <GifItem {...image} />
            </Col>
          ))}
        </Row>
      </Container> */}
    </>
  )
}
