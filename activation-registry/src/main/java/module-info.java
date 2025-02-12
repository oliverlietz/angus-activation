/*
 * Copyright (c) 2021, 2023 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/**
 * Eclipse Angus - Activation provides implementation of Jakarta Activation Specification.
 */
module org.eclipse.angus.activation {
    exports org.eclipse.angus.activation;
    requires java.logging;
    requires transitive jakarta.activation;

    requires static org.graalvm.sdk;
    requires static osgi.annotation;
    requires static osgi.core;

    provides jakarta.activation.spi.MailcapRegistryProvider with org.eclipse.angus.activation.MailcapRegistryProviderImpl;
    provides jakarta.activation.spi.MimeTypeRegistryProvider with org.eclipse.angus.activation.MimeTypeRegistryProviderImpl;
}
