
package br.com.wine.service.customer.controllers;

import org.springframework.cloud.openfeign.FeignClient;

import br.com.wine.service.customer.api.v1.CustomerService;

/**
 * CustomerClient
 */

@FeignClient(name = "customer", url = "http://localhost:${server.port}", path = "/api/v1")
public interface CustomerClient extends CustomerService {

}