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
* Edit member information request parameters
*/
export class UpdateMemberRo {
    /**
    * Member ID
    */
    'memberId': number;
    /**
    * Member Name
    */
    'memberName'?: string;
    /**
    * Position
    */
    'position'?: string;
    /**
    * email
    */
    'email'?: string;
    /**
    * Job No
    */
    'jobNumber'?: string;
    /**
    * Department ID
    */
    'teamIds'?: Array<number>;
    /**
    * Department ID
    */
    'roleIds'?: Array<number>;
    /**
    * Attribution tag ID set
    */
    'tagIds'?: Array<number>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "memberId",
            "baseName": "memberId",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "memberName",
            "baseName": "memberName",
            "type": "string",
            "format": ""
        },
        {
            "name": "position",
            "baseName": "position",
            "type": "string",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "jobNumber",
            "baseName": "jobNumber",
            "type": "string",
            "format": ""
        },
        {
            "name": "teamIds",
            "baseName": "teamIds",
            "type": "Array<number>",
            "format": "int64"
        },
        {
            "name": "roleIds",
            "baseName": "roleIds",
            "type": "Array<number>",
            "format": "int64"
        },
        {
            "name": "tagIds",
            "baseName": "tagIds",
            "type": "Array<number>",
            "format": "int64"
        }    ];

    static getAttributeTypeMap() {
        return UpdateMemberRo.attributeTypeMap;
    }

    public constructor() {
    }
}

