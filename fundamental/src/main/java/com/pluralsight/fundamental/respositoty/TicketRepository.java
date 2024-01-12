package com.pluralsight.fundamental.respositoty;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamental.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
