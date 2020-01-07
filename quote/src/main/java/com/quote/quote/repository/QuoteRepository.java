package com.quote.quote.repository;

import com.quote.quote.models.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long>
{

}