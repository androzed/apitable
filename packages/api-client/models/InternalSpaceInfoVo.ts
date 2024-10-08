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

import { SpaceLabs } from '../models/SpaceLabs';
import { HttpFile } from '../http/http';

/**
* space information
*/
export class InternalSpaceInfoVo {
    /**
    * space id
    */
    'spaceId'?: string;
    'labs'?: SpaceLabs;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "spaceId",
            "baseName": "spaceId",
            "type": "string",
            "format": ""
        },
        {
            "name": "labs",
            "baseName": "labs",
            "type": "SpaceLabs",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return InternalSpaceInfoVo.attributeTypeMap;
    }

    public constructor() {
    }
}

