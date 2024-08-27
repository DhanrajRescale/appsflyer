package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new android.support.v4.media.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final p0[] f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3578b;

    public q0(p0... p0VarArr) {
        this(-9223372036854775807L, p0VarArr);
    }

    public final q0 a(p0... p0VarArr) {
        if (p0VarArr.length == 0) {
            return this;
        }
        int i10 = e5.x.f15050a;
        p0[] p0VarArr2 = this.f3577a;
        Object[] copyOf = Arrays.copyOf(p0VarArr2, p0VarArr2.length + p0VarArr.length);
        System.arraycopy(p0VarArr, 0, copyOf, p0VarArr2.length, p0VarArr.length);
        return new q0(this.f3578b, (p0[]) copyOf);
    }

    public final p0 b(int i10) {
        return this.f3577a[i10];
    }

    public final int c() {
        return this.f3577a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (Arrays.equals(this.f3577a, q0Var.f3577a) && this.f3578b == q0Var.f3578b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return lp.g0.g(this.f3578b) + (Arrays.hashCode(this.f3577a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f3577a));
        long j10 = this.f3578b;
        if (j10 == -9223372036854775807L) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        p0[] p0VarArr = this.f3577a;
        parcel.writeInt(p0VarArr.length);
        for (p0 p0Var : p0VarArr) {
            parcel.writeParcelable(p0Var, 0);
        }
        parcel.writeLong(this.f3578b);
    }

    public q0(long j10, p0... p0VarArr) {
        this.f3578b = j10;
        this.f3577a = p0VarArr;
    }

    public q0(List list) {
        this((p0[]) list.toArray(new p0[0]));
    }

    public q0(Parcel parcel) {
        this.f3577a = new p0[parcel.readInt()];
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f3577a;
            if (i10 < p0VarArr.length) {
                p0VarArr[i10] = (p0) parcel.readParcelable(p0.class.getClassLoader());
                i10++;
            } else {
                this.f3578b = parcel.readLong();
                return;
            }
        }
    }
}
