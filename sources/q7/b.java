package q7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class b implements p7.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f31807b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f31808a;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f31808a = sQLiteDatabase;
    }

    public final void a() {
        this.f31808a.beginTransaction();
    }

    public final void b() {
        this.f31808a.endTransaction();
    }

    public final void c(String str) {
        this.f31808a.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31808a.close();
    }

    public final Cursor d(String str) {
        return f(new tr.e(str));
    }

    public final Cursor f(p7.e eVar) {
        return this.f31808a.rawQueryWithFactory(new a(eVar, 0), eVar.l(), f31807b, null);
    }

    public final void g() {
        this.f31808a.setTransactionSuccessful();
    }
}
