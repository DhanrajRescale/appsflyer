package ls;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f0 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final File f25185a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f25186b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f25187c;

    public f0(Context context) {
        super(context, "mixpanel", (SQLiteDatabase.CursorFactory) null, 7);
        this.f25185a = context.getDatabasePath("mixpanel");
        this.f25186b = d0.a(context);
        this.f25187c = context;
    }

    public final void a() {
        close();
        this.f25185a.delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FilenameFilter, java.lang.Object] */
    public final void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(g0.f25199f);
        sQLiteDatabase.execSQL(g0.f25203j);
        Context context = this.f25187c;
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        if (file.exists() && file.isDirectory()) {
            for (String str : file.list(new Object())) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.split("\\.xml")[0], 0);
                String string = sharedPreferences.getString("waiting_array", null);
                if (string != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        sQLiteDatabase.beginTransaction();
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            try {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                    String string2 = jSONObject.getString("$token");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("data", jSONObject.toString());
                                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("automatic_data", Boolean.FALSE);
                                    contentValues.put("token", string2);
                                    sQLiteDatabase.insert("anonymous_people", null, contentValues);
                                } catch (JSONException unused) {
                                }
                            } catch (Throwable th2) {
                                sQLiteDatabase.endTransaction();
                                throw th2;
                                break;
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (JSONException unused2) {
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("waiting_array");
                    edit.apply();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        el.l.T0("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
        sQLiteDatabase.execSQL(g0.f25196c);
        sQLiteDatabase.execSQL(g0.f25197d);
        sQLiteDatabase.execSQL(g0.f25198e);
        sQLiteDatabase.execSQL(g0.f25199f);
        sQLiteDatabase.execSQL(g0.f25200g);
        sQLiteDatabase.execSQL(g0.f25201h);
        sQLiteDatabase.execSQL(g0.f25202i);
        sQLiteDatabase.execSQL(g0.f25203j);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12;
        int i13;
        el.l.T0("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
        if (i10 >= 4 && i11 <= 7) {
            if (i10 == 4) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE people ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN token STRING NOT NULL DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE people ADD COLUMN token STRING NOT NULL DEFAULT ''");
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM events", null);
                while (rawQuery.moveToNext()) {
                    try {
                        String string = new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("data"))).getJSONObject("properties").getString("token");
                        i13 = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                        try {
                            sQLiteDatabase.execSQL("UPDATE events SET token = '" + string + "' WHERE _id = " + i13);
                        } catch (JSONException unused) {
                            sQLiteDatabase.delete("events", "_id = " + i13, null);
                        }
                    } catch (JSONException unused2) {
                        i13 = 0;
                    }
                }
                Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM people", null);
                while (rawQuery2.moveToNext()) {
                    try {
                        String string2 = new JSONObject(rawQuery2.getString(rawQuery2.getColumnIndex("data"))).getString("$token");
                        i12 = rawQuery2.getInt(rawQuery2.getColumnIndex("_id"));
                        try {
                            sQLiteDatabase.execSQL("UPDATE people SET token = '" + string2 + "' WHERE _id = " + i12);
                        } catch (JSONException unused3) {
                            sQLiteDatabase.delete("people", "_id = " + i12, null);
                        }
                    } catch (JSONException unused4) {
                        i12 = 0;
                    }
                }
                sQLiteDatabase.execSQL(g0.f25198e);
                sQLiteDatabase.execSQL(g0.f25202i);
                b(sQLiteDatabase);
            }
            if (i10 == 5) {
                sQLiteDatabase.execSQL(g0.f25198e);
                sQLiteDatabase.execSQL(g0.f25202i);
                b(sQLiteDatabase);
            }
            if (i10 == 6) {
                b(sQLiteDatabase);
                return;
            }
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS people");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS groups");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS anonymous_people");
        sQLiteDatabase.execSQL(g0.f25196c);
        sQLiteDatabase.execSQL(g0.f25197d);
        sQLiteDatabase.execSQL(g0.f25198e);
        sQLiteDatabase.execSQL(g0.f25199f);
        sQLiteDatabase.execSQL(g0.f25200g);
        sQLiteDatabase.execSQL(g0.f25201h);
        sQLiteDatabase.execSQL(g0.f25202i);
        sQLiteDatabase.execSQL(g0.f25203j);
    }
}
