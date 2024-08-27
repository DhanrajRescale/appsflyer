package q7;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: classes.dex */
public class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f31821a;

    public f(SQLiteProgram sQLiteProgram) {
        this.f31821a = sQLiteProgram;
    }

    public final void a(int i10, byte[] bArr) {
        this.f31821a.bindBlob(i10, bArr);
    }

    public final void b(int i10, double d10) {
        this.f31821a.bindDouble(i10, d10);
    }

    public final void c(int i10, long j10) {
        this.f31821a.bindLong(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31821a.close();
    }

    public final void d(int i10) {
        this.f31821a.bindNull(i10);
    }

    public final void f(int i10, String str) {
        this.f31821a.bindString(i10, str);
    }
}
