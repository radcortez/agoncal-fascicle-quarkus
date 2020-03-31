package org.agoncal.fascicle.quarkus.core.configuration.yaml;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Singleton;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@Singleton
// tag::adocSnippet[]
public class Invoice {

  Float subtotal;
  @ConfigProperty(name = "invoice.vatRate", defaultValue = "10")
  Float vatRate;
  Float vatAmount;
  Float total;
  @ConfigProperty(name = "invoice.allowsDiscount", defaultValue = "true")
  Boolean allowsDiscount;
  @ConfigProperty(name = "invoice.discountRate", defaultValue = "2.5")
  Float discountRate;
  @ConfigProperty(name = "invoice.terms")
  String terms;
  @ConfigProperty(name = "invoice.penalties")
  String penalties;
}
