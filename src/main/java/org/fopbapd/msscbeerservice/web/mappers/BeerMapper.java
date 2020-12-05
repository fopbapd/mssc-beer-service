package org.fopbapd.msscbeerservice.web.mappers;

import org.fopbapd.msscbeerservice.domain.Beer;
import org.fopbapd.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    Beer beerToBeerDto(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);
}
