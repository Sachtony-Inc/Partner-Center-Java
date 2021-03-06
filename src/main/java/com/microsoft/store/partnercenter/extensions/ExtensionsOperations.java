// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.extensions;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.extensions.products.IProductExtensions;
import com.microsoft.store.partnercenter.extensions.products.ProductExtensionsOperations;

/**
 * Extensions operations implementation.
 */
public class ExtensionsOperations 
    extends BasePartnerComponentString implements IExtensions 
{
    /**
     * The product extensions operations.
     */
    private IProductExtensions products;

    /**
     * Initializes a new instance of the ProductExtensionsOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public ExtensionsOperations(IPartner rootPartnerOperations) {
        super(rootPartnerOperations, null);
    }

	/**
	 * Retrieves the product extension operations.
	 * 
	 * @return The product extensions operations.
	 */
    public IProductExtensions getProduct()
    {
        if(products == null)
        {
            products = new ProductExtensionsOperations(this.getPartner());
        }
        
        return products;
    }
}