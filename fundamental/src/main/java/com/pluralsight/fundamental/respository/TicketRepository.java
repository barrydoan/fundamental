package com.pluralsight.fundamental.respository;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamental.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
