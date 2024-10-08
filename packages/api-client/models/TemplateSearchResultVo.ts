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

import { AlbumVo } from '../models/AlbumVo';
import { TemplateSearchResult } from '../models/TemplateSearchResult';
import { HttpFile } from '../http/http';

/**
* Template Search Result View
*/
export class TemplateSearchResultVo {
    /**
    * Albums View List
    */
    'albums'?: Array<AlbumVo>;
    /**
    * Template View List
    */
    'templates'?: Array<TemplateSearchResult>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "albums",
            "baseName": "albums",
            "type": "Array<AlbumVo>",
            "format": ""
        },
        {
            "name": "templates",
            "baseName": "templates",
            "type": "Array<TemplateSearchResult>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return TemplateSearchResultVo.attributeTypeMap;
    }

    public constructor() {
    }
}

