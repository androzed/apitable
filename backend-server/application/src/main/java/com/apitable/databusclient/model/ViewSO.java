/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.apitable.databusclient.model.IFilterInfo;
import com.apitable.databusclient.model.ISortInfo;
import com.apitable.databusclient.model.ISortedField;
import com.apitable.databusclient.model.IViewLockInfo;
import com.apitable.databusclient.model.ViewColumnSO;
import com.apitable.databusclient.model.ViewRowSO;
import com.apitable.databusclient.model.ViewStyleSo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * ViewSO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViewSO {
  public static final String SERIALIZED_NAME_AUTO_HEAD_HEIGHT = "autoHeadHeight";
  @SerializedName(SERIALIZED_NAME_AUTO_HEAD_HEIGHT)
  private Boolean autoHeadHeight;

  public static final String SERIALIZED_NAME_AUTO_SAVE = "autoSave";
  @SerializedName(SERIALIZED_NAME_AUTO_SAVE)
  private Boolean autoSave;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ViewColumnSO> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_HIDDEN_COLUMN_WITHIN_MIRROR = "displayHiddenColumnWithinMirror";
  @SerializedName(SERIALIZED_NAME_DISPLAY_HIDDEN_COLUMN_WITHIN_MIRROR)
  private Boolean displayHiddenColumnWithinMirror;

  public static final String SERIALIZED_NAME_FILTER_INFO = "filterInfo";
  @SerializedName(SERIALIZED_NAME_FILTER_INFO)
  private IFilterInfo filterInfo;

  public static final String SERIALIZED_NAME_FROZEN_COLUMN_COUNT = "frozenColumnCount";
  @SerializedName(SERIALIZED_NAME_FROZEN_COLUMN_COUNT)
  private Integer frozenColumnCount;

  public static final String SERIALIZED_NAME_GROUP_INFO = "groupInfo";
  @SerializedName(SERIALIZED_NAME_GROUP_INFO)
  private List<ISortedField> groupInfo;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCK_INFO = "lockInfo";
  @SerializedName(SERIALIZED_NAME_LOCK_INFO)
  private IViewLockInfo lockInfo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROW_HEIGHT_LEVEL = "rowHeightLevel";
  @SerializedName(SERIALIZED_NAME_ROW_HEIGHT_LEVEL)
  private Integer rowHeightLevel;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<ViewRowSO> rows;

  public static final String SERIALIZED_NAME_SORT_INFO = "sortInfo";
  @SerializedName(SERIALIZED_NAME_SORT_INFO)
  private ISortInfo sortInfo;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private ViewStyleSo style;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Long type;

  public ViewSO() {
  }

  public ViewSO autoHeadHeight(Boolean autoHeadHeight) {
    
    this.autoHeadHeight = autoHeadHeight;
    return this;
  }

   /**
   * Get autoHeadHeight
   * @return autoHeadHeight
  **/
  @javax.annotation.Nullable
  public Boolean getAutoHeadHeight() {
    return autoHeadHeight;
  }


  public void setAutoHeadHeight(Boolean autoHeadHeight) {
    this.autoHeadHeight = autoHeadHeight;
  }


  public ViewSO autoSave(Boolean autoSave) {
    
    this.autoSave = autoSave;
    return this;
  }

   /**
   * Get autoSave
   * @return autoSave
  **/
  @javax.annotation.Nullable
  public Boolean getAutoSave() {
    return autoSave;
  }


  public void setAutoSave(Boolean autoSave) {
    this.autoSave = autoSave;
  }


  public ViewSO columns(List<ViewColumnSO> columns) {
    
    this.columns = columns;
    return this;
  }

  public ViewSO addColumnsItem(ViewColumnSO columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nonnull
  public List<ViewColumnSO> getColumns() {
    return columns;
  }


  public void setColumns(List<ViewColumnSO> columns) {
    this.columns = columns;
  }


  public ViewSO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ViewSO displayHiddenColumnWithinMirror(Boolean displayHiddenColumnWithinMirror) {
    
    this.displayHiddenColumnWithinMirror = displayHiddenColumnWithinMirror;
    return this;
  }

   /**
   * Get displayHiddenColumnWithinMirror
   * @return displayHiddenColumnWithinMirror
  **/
  @javax.annotation.Nullable
  public Boolean getDisplayHiddenColumnWithinMirror() {
    return displayHiddenColumnWithinMirror;
  }


  public void setDisplayHiddenColumnWithinMirror(Boolean displayHiddenColumnWithinMirror) {
    this.displayHiddenColumnWithinMirror = displayHiddenColumnWithinMirror;
  }


  public ViewSO filterInfo(IFilterInfo filterInfo) {
    
    this.filterInfo = filterInfo;
    return this;
  }

   /**
   * Get filterInfo
   * @return filterInfo
  **/
  @javax.annotation.Nullable
  public IFilterInfo getFilterInfo() {
    return filterInfo;
  }


  public void setFilterInfo(IFilterInfo filterInfo) {
    this.filterInfo = filterInfo;
  }


  public ViewSO frozenColumnCount(Integer frozenColumnCount) {
    
    this.frozenColumnCount = frozenColumnCount;
    return this;
  }

   /**
   * Get frozenColumnCount
   * @return frozenColumnCount
  **/
  @javax.annotation.Nullable
  public Integer getFrozenColumnCount() {
    return frozenColumnCount;
  }


  public void setFrozenColumnCount(Integer frozenColumnCount) {
    this.frozenColumnCount = frozenColumnCount;
  }


  public ViewSO groupInfo(List<ISortedField> groupInfo) {
    
    this.groupInfo = groupInfo;
    return this;
  }

  public ViewSO addGroupInfoItem(ISortedField groupInfoItem) {
    if (this.groupInfo == null) {
      this.groupInfo = new ArrayList<>();
    }
    this.groupInfo.add(groupInfoItem);
    return this;
  }

   /**
   * Get groupInfo
   * @return groupInfo
  **/
  @javax.annotation.Nullable
  public List<ISortedField> getGroupInfo() {
    return groupInfo;
  }


  public void setGroupInfo(List<ISortedField> groupInfo) {
    this.groupInfo = groupInfo;
  }


  public ViewSO hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public ViewSO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ViewSO lockInfo(IViewLockInfo lockInfo) {
    
    this.lockInfo = lockInfo;
    return this;
  }

   /**
   * Get lockInfo
   * @return lockInfo
  **/
  @javax.annotation.Nullable
  public IViewLockInfo getLockInfo() {
    return lockInfo;
  }


  public void setLockInfo(IViewLockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }


  public ViewSO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ViewSO rowHeightLevel(Integer rowHeightLevel) {
    
    this.rowHeightLevel = rowHeightLevel;
    return this;
  }

   /**
   * Get rowHeightLevel
   * @return rowHeightLevel
  **/
  @javax.annotation.Nullable
  public Integer getRowHeightLevel() {
    return rowHeightLevel;
  }


  public void setRowHeightLevel(Integer rowHeightLevel) {
    this.rowHeightLevel = rowHeightLevel;
  }


  public ViewSO rows(List<ViewRowSO> rows) {
    
    this.rows = rows;
    return this;
  }

  public ViewSO addRowsItem(ViewRowSO rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<ViewRowSO> getRows() {
    return rows;
  }


  public void setRows(List<ViewRowSO> rows) {
    this.rows = rows;
  }


  public ViewSO sortInfo(ISortInfo sortInfo) {
    
    this.sortInfo = sortInfo;
    return this;
  }

   /**
   * Get sortInfo
   * @return sortInfo
  **/
  @javax.annotation.Nullable
  public ISortInfo getSortInfo() {
    return sortInfo;
  }


  public void setSortInfo(ISortInfo sortInfo) {
    this.sortInfo = sortInfo;
  }


  public ViewSO style(ViewStyleSo style) {
    
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @javax.annotation.Nullable
  public ViewStyleSo getStyle() {
    return style;
  }


  public void setStyle(ViewStyleSo style) {
    this.style = style;
  }


  public ViewSO type(Long type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * minimum: 0
   * @return type
  **/
  @javax.annotation.Nullable
  public Long getType() {
    return type;
  }


  public void setType(Long type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewSO viewSO = (ViewSO) o;
    return Objects.equals(this.autoHeadHeight, viewSO.autoHeadHeight) &&
        Objects.equals(this.autoSave, viewSO.autoSave) &&
        Objects.equals(this.columns, viewSO.columns) &&
        Objects.equals(this.description, viewSO.description) &&
        Objects.equals(this.displayHiddenColumnWithinMirror, viewSO.displayHiddenColumnWithinMirror) &&
        Objects.equals(this.filterInfo, viewSO.filterInfo) &&
        Objects.equals(this.frozenColumnCount, viewSO.frozenColumnCount) &&
        Objects.equals(this.groupInfo, viewSO.groupInfo) &&
        Objects.equals(this.hidden, viewSO.hidden) &&
        Objects.equals(this.id, viewSO.id) &&
        Objects.equals(this.lockInfo, viewSO.lockInfo) &&
        Objects.equals(this.name, viewSO.name) &&
        Objects.equals(this.rowHeightLevel, viewSO.rowHeightLevel) &&
        Objects.equals(this.rows, viewSO.rows) &&
        Objects.equals(this.sortInfo, viewSO.sortInfo) &&
        Objects.equals(this.style, viewSO.style) &&
        Objects.equals(this.type, viewSO.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoHeadHeight, autoSave, columns, description, displayHiddenColumnWithinMirror, filterInfo, frozenColumnCount, groupInfo, hidden, id, lockInfo, name, rowHeightLevel, rows, sortInfo, style, type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewSO {\n");
    sb.append("    autoHeadHeight: ").append(toIndentedString(autoHeadHeight)).append("\n");
    sb.append("    autoSave: ").append(toIndentedString(autoSave)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayHiddenColumnWithinMirror: ").append(toIndentedString(displayHiddenColumnWithinMirror)).append("\n");
    sb.append("    filterInfo: ").append(toIndentedString(filterInfo)).append("\n");
    sb.append("    frozenColumnCount: ").append(toIndentedString(frozenColumnCount)).append("\n");
    sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockInfo: ").append(toIndentedString(lockInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rowHeightLevel: ").append(toIndentedString(rowHeightLevel)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    sortInfo: ").append(toIndentedString(sortInfo)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("autoHeadHeight");
    openapiFields.add("autoSave");
    openapiFields.add("columns");
    openapiFields.add("description");
    openapiFields.add("displayHiddenColumnWithinMirror");
    openapiFields.add("filterInfo");
    openapiFields.add("frozenColumnCount");
    openapiFields.add("groupInfo");
    openapiFields.add("hidden");
    openapiFields.add("id");
    openapiFields.add("lockInfo");
    openapiFields.add("name");
    openapiFields.add("rowHeightLevel");
    openapiFields.add("rows");
    openapiFields.add("sortInfo");
    openapiFields.add("style");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("columns");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ViewSO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ViewSO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewSO is not found in the empty JSON string", ViewSO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewSO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewSO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ViewSO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
      }

      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      // validate the required field `columns` (array)
      for (int i = 0; i < jsonArraycolumns.size(); i++) {
        ViewColumnSO.validateJsonElement(jsonArraycolumns.get(i));
      };
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `filterInfo`
      if (jsonObj.get("filterInfo") != null && !jsonObj.get("filterInfo").isJsonNull()) {
        IFilterInfo.validateJsonElement(jsonObj.get("filterInfo"));
      }
      if (jsonObj.get("groupInfo") != null && !jsonObj.get("groupInfo").isJsonNull()) {
        JsonArray jsonArraygroupInfo = jsonObj.getAsJsonArray("groupInfo");
        if (jsonArraygroupInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groupInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groupInfo` to be an array in the JSON string but got `%s`", jsonObj.get("groupInfo").toString()));
          }

          // validate the optional field `groupInfo` (array)
          for (int i = 0; i < jsonArraygroupInfo.size(); i++) {
            ISortedField.validateJsonElement(jsonArraygroupInfo.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `lockInfo`
      if (jsonObj.get("lockInfo") != null && !jsonObj.get("lockInfo").isJsonNull()) {
        IViewLockInfo.validateJsonElement(jsonObj.get("lockInfo"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonNull()) {
        JsonArray jsonArrayrows = jsonObj.getAsJsonArray("rows");
        if (jsonArrayrows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
          }

          // validate the optional field `rows` (array)
          for (int i = 0; i < jsonArrayrows.size(); i++) {
            ViewRowSO.validateJsonElement(jsonArrayrows.get(i));
          };
        }
      }
      // validate the optional field `sortInfo`
      if (jsonObj.get("sortInfo") != null && !jsonObj.get("sortInfo").isJsonNull()) {
        ISortInfo.validateJsonElement(jsonObj.get("sortInfo"));
      }
      // validate the optional field `style`
      if (jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) {
        ViewStyleSo.validateJsonElement(jsonObj.get("style"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewSO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewSO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewSO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewSO.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewSO>() {
           @Override
           public void write(JsonWriter out, ViewSO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewSO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewSO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewSO
  * @throws IOException if the JSON string is invalid with respect to ViewSO
  */
  public static ViewSO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewSO.class);
  }

 /**
  * Convert an instance of ViewSO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

