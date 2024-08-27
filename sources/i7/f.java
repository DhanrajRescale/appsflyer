package i7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f19721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19722b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19723c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19724d;

    public f(int i10, int i11, long j10, long j11) {
        this.f19721a = i10;
        this.f19722b = i11;
        this.f19723c = j10;
        this.f19724d = j11;
    }

    public static f a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            f fVar = new f(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return fVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f19721a);
            dataOutputStream.writeInt(this.f19722b);
            dataOutputStream.writeLong(this.f19723c);
            dataOutputStream.writeLong(this.f19724d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f19722b == fVar.f19722b && this.f19723c == fVar.f19723c && this.f19721a == fVar.f19721a && this.f19724d == fVar.f19724d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19722b), Long.valueOf(this.f19723c), Integer.valueOf(this.f19721a), Long.valueOf(this.f19724d));
    }
}
