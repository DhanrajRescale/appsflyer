package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new android.support.v4.media.a(15);

    /* renamed from: a, reason: collision with root package name */
    public int f3572a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f3573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3574c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3575d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f3576e;

    public q(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3573b = uuid;
        this.f3574c = str;
        str2.getClass();
        this.f3575d = str2;
        this.f3576e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = l.f3399a;
        UUID uuid3 = this.f3573b;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        q qVar = (q) obj;
        if (!e5.x.a(this.f3574c, qVar.f3574c) || !e5.x.a(this.f3575d, qVar.f3575d) || !e5.x.a(this.f3573b, qVar.f3573b) || !Arrays.equals(this.f3576e, qVar.f3576e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3572a == 0) {
            int hashCode2 = this.f3573b.hashCode() * 31;
            String str = this.f3574c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3572a = Arrays.hashCode(this.f3576e) + jr.h.g(this.f3575d, (hashCode2 + hashCode) * 31, 31);
        }
        return this.f3572a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3573b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3574c);
        parcel.writeString(this.f3575d);
        parcel.writeByteArray(this.f3576e);
    }

    public q(Parcel parcel) {
        this.f3573b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3574c = parcel.readString();
        String readString = parcel.readString();
        int i10 = e5.x.f15050a;
        this.f3575d = readString;
        this.f3576e = parcel.createByteArray();
    }
}
