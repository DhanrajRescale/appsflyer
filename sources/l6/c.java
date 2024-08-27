package l6;

import android.os.Parcel;
import android.os.Parcelable;
import b5.p0;
import java.util.ArrayList;
import java.util.List;
import yk.j;

/* loaded from: classes.dex */
public final class c implements p0 {
    public static final Parcelable.Creator<c> CREATOR = new k6.d(9);

    /* renamed from: a, reason: collision with root package name */
    public final List f24103a;

    public c(ArrayList arrayList) {
        this.f24103a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((b) arrayList.get(0)).f24101b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i10)).f24100a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((b) arrayList.get(i10)).f24101b;
                    i10++;
                }
            }
        }
        j.E0(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f24103a.equals(((c) obj).f24103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24103a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f24103a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f24103a);
    }
}
