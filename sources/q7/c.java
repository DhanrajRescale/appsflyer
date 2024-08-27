package q7;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import m.c0;

/* loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f31809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f31810b;

    public c(c0 c0Var, b[] bVarArr) {
        this.f31809a = c0Var;
        this.f31810b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b a10 = d.a(this.f31810b, sQLiteDatabase);
        this.f31809a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + a10.f31808a.getPath());
        SQLiteDatabase sQLiteDatabase2 = a10.f31808a;
        if (!sQLiteDatabase2.isOpen()) {
            c0.d(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                a10.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    c0.d((String) it.next().second);
                }
            } else {
                c0.d(sQLiteDatabase2.getPath());
            }
        }
    }
}
