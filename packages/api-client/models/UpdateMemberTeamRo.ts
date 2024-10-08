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
* Adjust member department request parameters
*/
export class UpdateMemberTeamRo {
    /**
    * Member ID
    */
    'memberIds': Array<number>;
    /**
    * The original department ID list can be blank. If it is blank, it means the root department
    */
    'preTeamId'?: number;
    /**
    * Adjusted Department ID List
    */
    'newTeamIds': Array<number>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "memberIds",
            "baseName": "memberIds",
            "type": "Array<number>",
            "format": "int64"
        },
        {
            "name": "preTeamId",
            "baseName": "preTeamId",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "newTeamIds",
            "baseName": "newTeamIds",
            "type": "Array<number>",
            "format": "int64"
        }    ];

    static getAttributeTypeMap() {
        return UpdateMemberTeamRo.attributeTypeMap;
    }

    public constructor() {
    }
}

