package th.co.scb.ngage.constant;

public class DatabaseConstant {
    public static final String NGAGE_SCHEMAS = "ngage.";
    public static final String SYSTEM_SCHEMAS = "system.";
    public static final String QRY_SEARCH_ALL = "SELECT * FROM ";
    public static final String QRY_SEARCH_USER = "SELECT id, is_active AS isactive, first_name||' '||last_name AS fullname, email, oc_code AS occode, role_id AS roleid, position_id AS positionid, staff_id AS staffid FROM ";
    public static final String QRY_SEARCH_PERMISSION = "SELECT is_can_read, is_can_create, is_can_update, is_can_delete, is_can_read_all, is_can_modify_all FROM ";
}
