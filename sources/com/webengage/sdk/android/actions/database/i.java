package com.webengage.sdk.android.actions.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i extends com.webengage.sdk.android.utils.b {

    /* renamed from: a, reason: collision with root package name */
    private static i f12272a;

    private i(Context context) {
        super(context, "event_data.db", 2);
    }

    public int a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return a("events", "id in (" + new String(new char[list.size() - 1]).replaceAll("\u0000", "?,") + "?)", (String[]) list.toArray(new String[list.size()]));
    }

    public int b(List<String> list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", "FAILED");
        return a("events", contentValues, "id in (" + new String(new char[list.size() - 1]).replaceAll("\u0000", "?,") + "?)", (String[]) list.toArray(new String[list.size()]));
    }

    public int d() {
        Cursor a10 = a("select count(*) from events where sync_state=\"NOT_SYNCED\" or sync_state=\"FAILED\"", (String[]) null);
        if (a10 != null) {
            r1 = a10.moveToFirst() ? a10.getInt(0) : 0;
            a10.close();
        }
        return r1;
    }

    public int e() {
        Cursor a10 = a("SELECT id FROM events ORDER BY event_time ASC LIMIT 0,1", (String[]) null);
        int i10 = (a10 == null || !a10.moveToFirst()) ? -1 : a10.getInt(0);
        if (a10 != null && !a10.isClosed()) {
            a10.close();
        }
        return i10;
    }

    public int f() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", "NOT_SYNCED");
        return a("events", contentValues, "sync_state=\"SYNCING\"", null);
    }

    public static i b(Context context) {
        if (f12272a == null) {
            synchronized (i.class) {
                try {
                    if (f12272a == null) {
                        f12272a = new i(context);
                    }
                } finally {
                }
            }
        }
        return f12272a;
    }

    public long a(com.webengage.sdk.android.n nVar) {
        int e10;
        if (c() > 3145728 && (e10 = e()) != -1) {
            a("events", "id = ?", new String[]{Integer.toString(e10)});
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("license_code", nVar.j());
        contentValues.put("interface_id", nVar.h());
        contentValues.put("luid", nVar.i());
        contentValues.put("suid", nVar.k());
        contentValues.put("cuid", nVar.a());
        contentValues.put("category", nVar.b());
        contentValues.put("event_name", nVar.d());
        contentValues.put("event_time", WebEngageUtils.a(nVar.e()));
        contentValues.put("event_data", WebEngageUtils.a(nVar.c()));
        if (nVar.l() == null) {
            contentValues.put("system_data", WebEngageUtils.a((Object) new HashMap()));
        } else {
            contentValues.put("system_data", WebEngageUtils.a(nVar.l()));
        }
        contentValues.put("sync_state", "NOT_SYNCED");
        return a("events", contentValues);
    }

    public synchronized ArrayList<com.webengage.sdk.android.n> a(int i10) {
        ArrayList<com.webengage.sdk.android.n> arrayList = new ArrayList<>();
        Cursor a10 = a("select  * from events where sync_state=\"NOT_SYNCED\" or sync_state=\"FAILED\" ORDER BY event_time ASC LIMIT 0," + i10, (String[]) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", "SYNCING");
        if (a10 != null) {
            if (a10.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                do {
                    com.webengage.sdk.android.n nVar = new com.webengage.sdk.android.n();
                    nVar.a(Integer.valueOf(a10.getInt(a10.getColumnIndex("id"))));
                    nVar.d(a10.getString(a10.getColumnIndex("interface_id")));
                    nVar.f(a10.getString(a10.getColumnIndex("license_code")));
                    nVar.e(a10.getString(a10.getColumnIndex("luid")));
                    nVar.g(a10.getString(a10.getColumnIndex("suid")));
                    nVar.a(a10.getString(a10.getColumnIndex("cuid")));
                    nVar.b(a10.getString(a10.getColumnIndex("category")));
                    nVar.c(a10.getString(a10.getColumnIndex("event_name")));
                    nVar.a((Date) WebEngageUtils.a(a10.getBlob(a10.getColumnIndex("event_time"))));
                    nVar.a((Map<String, Object>) WebEngageUtils.a(a10.getBlob(a10.getColumnIndex("event_data"))));
                    nVar.c((Map<String, Object>) WebEngageUtils.a(a10.getBlob(a10.getColumnIndex("system_data"))));
                    arrayList2.add(Integer.toString(nVar.g().intValue()));
                    arrayList.add(nVar);
                } while (a10.moveToNext());
                a10.close();
                if (arrayList2.size() > 0) {
                    a("events", contentValues, "id in (" + new String(new char[arrayList2.size() - 1]).replaceAll("\u0000", "?,") + "?)", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
                return arrayList;
            }
            a10.close();
        }
        return arrayList;
    }

    @Override // com.webengage.sdk.android.utils.b
    public void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM events LIMIT 0", null);
                if (cursor.getColumnIndex("interface_id") == -1) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "events"));
                    a(sQLiteDatabase);
                }
            } catch (SQLException unused) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "events"));
                a(sQLiteDatabase);
                if (cursor == null) {
                    return;
                }
            }
            cursor.close();
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.webengage.sdk.android.utils.b
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %S (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT,%s TEXT, %s TEXT, %s TEXT,%s TEXT ,%s BLOB,%s BLOB ,%s BLOB,%s TEXT)", "events", "id", "license_code", "interface_id", "luid", "suid", "cuid", "category", "event_name", "event_time", "event_data", "system_data", "sync_state"));
    }

    @Override // com.webengage.sdk.android.utils.b
    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "events"));
        a(sQLiteDatabase);
    }

    public static boolean a(Context context) {
        return context.deleteDatabase("event_data.db");
    }
}
