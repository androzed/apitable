/**
 * Api Document
 * Backend_Server Api Document
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* Attachment capacity information view for spaces
*/
export class InternalSpaceCapacityVo {
    /**
    * whether to allow over limiting
    */
    'isAllowOverLimit'?: boolean;
    /**
    * used capacity unit byte
    */
    'usedCapacity'?: number;
    /**
    * total capacity unit byte
    */
    'totalCapacity'?: number;
    /**
    * current package capacity unit byte
    */
    'currentBundleCapacity'?: number;
    /**
    * gift unexpired capacity unit byte
    */
    'unExpireGiftCapacity'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "isAllowOverLimit",
            "baseName": "isAllowOverLimit",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "usedCapacity",
            "baseName": "usedCapacity",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "totalCapacity",
            "baseName": "totalCapacity",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "currentBundleCapacity",
            "baseName": "currentBundleCapacity",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "unExpireGiftCapacity",
            "baseName": "unExpireGiftCapacity",
            "type": "number",
            "format": "int64"
        }    ];

    static getAttributeTypeMap() {
        return InternalSpaceCapacityVo.attributeTypeMap;
    }

    public constructor() {
    }
}

