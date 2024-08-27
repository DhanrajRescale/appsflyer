package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class r implements Comparator, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new android.support.v4.media.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final q[] f3579a;

    /* renamed from: b, reason: collision with root package name */
    public int f3580b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3581c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3582d;

    public r(String str, ArrayList arrayList) {
        this(str, false, (q[]) arrayList.toArray(new q[0]));
    }

    public final r a(String str) {
        if (e5.x.a(this.f3581c, str)) {
            return this;
        }
        return new r(str, false, this.f3579a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        UUID uuid = l.f3399a;
        if (uuid.equals(qVar.f3573b)) {
            if (uuid.equals(qVar2.f3573b)) {
                return 0;
            }
            return 1;
        }
        return qVar.f3573b.compareTo(qVar2.f3573b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (e5.x.a(this.f3581c, rVar.f3581c) && Arrays.equals(this.f3579a, rVar.f3579a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3580b == 0) {
            String str = this.f3581c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3580b = (hashCode * 31) + Arrays.hashCode(this.f3579a);
        }
        return this.f3580b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3581c);
        parcel.writeTypedArray(this.f3579a, 0);
    }

    public r(String str, boolean z10, q... qVarArr) {
        this.f3581c = str;
        qVarArr = z10 ? (q[]) qVarArr.clone() : qVarArr;
        this.f3579a = qVarArr;
        this.f3582d = qVarArr.length;
        Arrays.sort(qVarArr, this);
    }

    public r(Parcel parcel) {
        this.f3581c = parcel.readString();
        q[] qVarArr = (q[]) parcel.createTypedArray(q.CREATOR);
        int i10 = e5.x.f15050a;
        this.f3579a = qVarArr;
        this.f3582d = qVarArr.length;
    }
}
