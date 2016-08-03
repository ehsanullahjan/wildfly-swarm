package org.wildfly.swarm.database.postgresql;

import javax.inject.Singleton;

import org.wildfly.swarm.spi.api.DefaultFraction;
import org.wildfly.swarm.spi.api.Fraction;

/**
 * @author Ken Finnigan
 */
@Singleton
@DefaultFraction
public class PostgreSQLFraction implements Fraction {
}