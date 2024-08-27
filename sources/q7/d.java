package q7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import m.c0;

/* loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final b[] f31811a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f31812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31813c;

    public d(Context context, String str, b[] bVarArr, c0 c0Var) {
        super(context, str, null, c0Var.f25500b, new c(c0Var, bVarArr));
        this.f31812b = c0Var;
        this.f31811a = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || bVar.f31808a != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase);
        }
        return bVarArr[0];
    }

    public final synchronized p7.a b() {
        this.f31813c = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (this.f31813c) {
            close();
            return b();
        }
        return a(this.f31811a, writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f31811a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f31811a, sQLiteDatabase);
        this.f31812b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            q7.b[] r0 = r4.f31811a
            q7.b r5 = a(r0, r5)
            m.c0 r0 = r4.f31812b
            r0.getClass()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r5.d(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L20
            r3 = 0
            if (r2 == 0) goto L22
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L20:
            r5 = move-exception
            goto L84
        L22:
            r2 = r3
        L23:
            r1.close()
            java.lang.Object r1 = r0.f25502d
            eb.f r1 = (eb.f) r1
            r1.getClass()
            eb.f.r(r5)
            if (r2 != 0) goto L5a
            java.lang.Object r1 = r0.f25502d
            eb.f r1 = (eb.f) r1
            r1.getClass()
            h.r0 r1 = eb.f.u(r5)
            boolean r2 = r1.f17735a
            if (r2 == 0) goto L42
            goto L5a
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.Object r1 = r1.f17736b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5a:
            r0.k(r5)
            java.lang.Object r5 = r0.f25502d
            eb.f r5 = (eb.f) r5
            java.lang.Object r0 = r5.f15309b
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            int r1 = androidx.work.impl.WorkDatabase_Impl.f2586t
            java.util.List r0 = r0.f24166h
            if (r0 == 0) goto L83
            int r0 = r0.size()
        L6f:
            if (r3 >= r0) goto L83
            java.lang.Object r1 = r5.f15309b
            androidx.work.impl.WorkDatabase_Impl r1 = (androidx.work.impl.WorkDatabase_Impl) r1
            java.util.List r1 = r1.f24166h
            java.lang.Object r1 = r1.get(r3)
            b8.g r1 = (b8.g) r1
            r1.getClass()
            int r3 = r3 + 1
            goto L6f
        L83:
            return
        L84:
            r1.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f31813c = true;
        this.f31812b.g(a(this.f31811a, sQLiteDatabase), i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006c  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f31813c = true;
        this.f31812b.g(a(this.f31811a, sQLiteDatabase), i10, i11);
    }
}
