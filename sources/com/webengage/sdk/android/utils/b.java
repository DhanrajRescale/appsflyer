package com.webengage.sdk.android.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class b extends SQLiteOpenHelper {
    public b(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return b().update(str, contentValues, str2, strArr);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public SQLiteDatabase b() {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return getWritableDatabase();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public abstract void b(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public long c() {
        try {
            return new File(a().getPath()).length();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        a(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        b(sQLiteDatabase, i10, i11);
    }

    public int a(String str, String str2, String[] strArr) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return b().delete(str, str2, strArr);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public long a(String str, ContentValues contentValues) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return b().insertOrThrow(str, null, contentValues);
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public Cursor a(String str, String[] strArr) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return a().rawQuery(str, strArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public SQLiteDatabase a() {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return getReadableDatabase();
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
