import React, { useEffect, useState } from 'react'
import { GifItem } from './GifItem'
import { getGifs } from '../helpers/getGifs'
import { ImageList, ImageListItem } from '@mui/material';

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
      {/* <h3>{ category }</h3> */}
      <ImageList variant="masonry" cols={3} gap={8}>
        {images.map((image) => (          
          <GifItem key = {image.id} image = { image }></GifItem>
        ))}
      </ImageList>
    </>
  )
}
