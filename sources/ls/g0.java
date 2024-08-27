package ls;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f25195b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f25196c = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: d, reason: collision with root package name */
    public static final String f25197d = "CREATE TABLE people (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: e, reason: collision with root package name */
    public static final String f25198e = "CREATE TABLE groups (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: f, reason: collision with root package name */
    public static final String f25199f = "CREATE TABLE anonymous_people (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: g, reason: collision with root package name */
    public static final String f25200g = "CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);";

    /* renamed from: h, reason: collision with root package name */
    public static final String f25201h = "CREATE INDEX IF NOT EXISTS time_idx ON people (created_at);";

    /* renamed from: i, reason: collision with root package name */
    public static final String f25202i = "CREATE INDEX IF NOT EXISTS time_idx ON groups (created_at);";

    /* renamed from: j, reason: collision with root package name */
    public static final String f25203j = "CREATE INDEX IF NOT EXISTS time_idx ON anonymous_people (created_at);";

    /* renamed from: a, reason: collision with root package name */
    public final f0 f25204a;

    public g0(Context context) {
        this.f25204a = new f0(context);
    }

    public static g0 g(Context context) {
        g0 g0Var;
        HashMap hashMap = f25195b;
        synchronized (hashMap) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!hashMap.containsKey(applicationContext)) {
                    g0Var = new g0(applicationContext);
                    hashMap.put(applicationContext, g0Var);
                } else {
                    g0Var = (g0) hashMap.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(org.json.JSONObject r10, java.lang.String r11, int r12, boolean r13) {
        /*
            r9 = this;
            ls.f0 r0 = r9.f25204a
            java.lang.String r1 = "Could not add Mixpanel data to table "
            java.lang.String r2 = "SELECT COUNT(*) FROM "
            boolean r3 = r9.b()
            java.lang.String r4 = "MixpanelAPI.Database"
            if (r3 != 0) goto L15
            java.lang.String r10 = "There is not enough space left on the device to store Mixpanel data, so data was discarded"
            el.l.M(r4, r10)
            r10 = -2
            return r10
        L15:
            java.lang.String r12 = jr.h.b(r12)
            r3 = 0
            android.database.sqlite.SQLiteDatabase r5 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r7 = "data"
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r6.put(r7, r10)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r10 = "created_at"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r6.put(r10, r7)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r10 = "automatic_data"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r6.put(r10, r13)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r10 = "token"
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r5.insert(r12, r3, r6)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r10.append(r12)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r13 = " WHERE token='"
            r10.append(r13)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r10.append(r11)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r11 = "'"
            r10.append(r11)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            android.database.Cursor r10 = r5.rawQuery(r10, r3)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r10.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r10.close()
            r0.close()
            goto La6
        L76:
            r11 = move-exception
            r3 = r10
            goto La7
        L79:
            r11 = move-exception
            goto L7f
        L7b:
            r11 = move-exception
            goto La7
        L7d:
            r11 = move-exception
            r10 = r3
        L7f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L76
            r13.append(r12)     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = ". Re-initializing database."
            r13.append(r12)     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L76
            el.l.N(r4, r12, r11)     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L99
            r10.close()     // Catch: java.lang.Throwable -> L76
            goto L9a
        L99:
            r3 = r10
        L9a:
            r0.a()     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto La2
            r3.close()
        La2:
            r0.close()
            r11 = -1
        La6:
            return r11
        La7:
            if (r3 == 0) goto Lac
            r3.close()
        Lac:
            r0.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.g0.a(org.json.JSONObject, java.lang.String, int, boolean):int");
    }

    public final boolean b() {
        File file = this.f25204a.f25185a;
        if (!file.exists() || Math.max(file.getUsableSpace(), r0.f25186b.f25153e) >= file.length()) {
            return true;
        }
        return false;
    }

    public final void c(int i10, String str) {
        f0 f0Var = this.f25204a;
        String b10 = jr.h.b(i10);
        try {
            try {
                f0Var.getWritableDatabase().delete(b10, "token = '" + str + "'", null);
            } catch (SQLiteException e10) {
                el.l.N("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                f0Var.a();
            }
        } finally {
            f0Var.close();
        }
    }

    public final void d(int i10, String str) {
        f0 f0Var = this.f25204a;
        String b10 = jr.h.b(i10);
        try {
            try {
                f0Var.getWritableDatabase().delete(b10, "automatic_data = 1 AND token = '" + str + "'", null);
            } catch (SQLiteException e10) {
                el.l.N("MixpanelAPI.Database", "Could not clean automatic Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                f0Var.a();
            }
        } finally {
            f0Var.close();
        }
    }

    public final void e(long j10, int i10) {
        f0 f0Var = this.f25204a;
        String b10 = jr.h.b(i10);
        try {
            try {
                f0Var.getWritableDatabase().delete(b10, "created_at <= " + j10, null);
            } catch (SQLiteException e10) {
                el.l.N("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                f0Var.a();
            }
        } finally {
            f0Var.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] f(int r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.g0.f(int, java.lang.String, boolean):java.lang.String[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.g0.h(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final int i(String str, Map map) {
        Cursor cursor;
        f0 f0Var = this.f25204a;
        if (!b()) {
            el.l.M("MixpanelAPI.Database", "There is not enough space left on the device to store Mixpanel data, so data was discarded");
            return -2;
        }
        ?? r42 = 0;
        r42 = 0;
        Cursor cursor2 = null;
        int i10 = 0;
        try {
        } catch (Throwable th2) {
            th = th2;
            r42 = str;
        }
        try {
            try {
                SQLiteDatabase writableDatabase = f0Var.getWritableDatabase();
                cursor = writableDatabase.rawQuery(new StringBuffer("SELECT * FROM events WHERE token = '" + str + "'").toString(), null);
                try {
                    writableDatabase.beginTransaction();
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                ContentValues contentValues = new ContentValues();
                                JSONObject jSONObject = new JSONObject(cursor.getString(cursor.getColumnIndex("data")));
                                JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
                                for (Map.Entry entry : map.entrySet()) {
                                    jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                jSONObject.put("properties", jSONObject2);
                                contentValues.put("data", jSONObject.toString());
                                writableDatabase.update("events", contentValues, "_id = " + cursor.getInt(cursor.getColumnIndex("_id")), null);
                                i10++;
                            } catch (JSONException unused) {
                            }
                        } catch (Throwable th3) {
                            writableDatabase.endTransaction();
                            throw th3;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    cursor.close();
                } catch (SQLiteException e10) {
                    e = e10;
                    el.l.N("MixpanelAPI.Database", "Could not re-write events history. Re-initializing database.", e);
                    if (cursor != null) {
                        cursor.close();
                    } else {
                        cursor2 = cursor;
                    }
                    f0Var.a();
                    r42 = cursor2;
                    if (cursor2 != null) {
                        cursor2.close();
                        r42 = cursor2;
                    }
                    f0Var.close();
                    return i10;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursor = null;
            }
            f0Var.close();
            return i10;
        } catch (Throwable th4) {
            th = th4;
            if (r42 != 0) {
                r42.close();
            }
            f0Var.close();
            throw th;
        }
    }
}
