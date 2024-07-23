import { ImageListItem } from '@mui/material'
import React from 'react'

export const GifItem = ({image}) => {
  return (
    <>
      <ImageListItem  key={image.id}>
        <img
          src={`${image.url}?w=248&fit=crop&auto=format`}
          srcSet={`${image.url}?w=248&fit=crop&auto=format&dpr=2 2x`}
          alt={image.title}
          loading="lazy"
        />
      </ImageListItem>
      {/* <ImageListItem key={title}>
        <img
          src={`${url}?w=161&fit=crop&auto=format`}
          srcSet={`${url}?w=161&fit=crop&auto=format&dpr=2 2x`}
          alt={title}
          loading="lazy"
        />
      </ImageListItem> */}
    </>
  )
}
