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
* Get members who have no permission on the specified node when mentioning people
*/
export class RemindUnitsNoPermissionRo {
    /**
    * Node ID
    */
    'nodeId': string;
    /**
    * Organizational Unit ID List
    */
    'unitIds': Array<number>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "nodeId",
            "baseName": "nodeId",
            "type": "string",
            "format": ""
        },
        {
            "name": "unitIds",
            "baseName": "unitIds",
            "type": "Array<number>",
            "format": "int64"
        }    ];

    static getAttributeTypeMap() {
        return RemindUnitsNoPermissionRo.attributeTypeMap;
    }

    public constructor() {
    }
}

