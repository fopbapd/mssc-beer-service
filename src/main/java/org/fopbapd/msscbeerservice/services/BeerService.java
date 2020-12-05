package org.fopbapd.msscbeerservice.services;

import org.fopbapd.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto updateBeerById(UUID beerId, BeerDto beerDto);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto getById(UUID beerId);
}
