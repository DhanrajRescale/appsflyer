package th;

import android.os.Parcel;
import android.os.Parcelable;
import hb.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new e(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f36084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36085b;

    /* renamed from: c, reason: collision with root package name */
    public final List f36086c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36087d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36088e;

    public c(String title, String subText, ArrayList scratchCards, String discoveryTitle, String missionToolTipText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        Intrinsics.checkNotNullParameter(scratchCards, "scratchCards");
        Intrinsics.checkNotNullParameter(discoveryTitle, "discoveryTitle");
        Intrinsics.checkNotNullParameter(missionToolTipText, "missionToolTipText");
        this.f36084a = title;
        this.f36085b = subText;
        this.f36086c = scratchCards;
        this.f36087d = discoveryTitle;
        this.f36088e = missionToolTipText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f36084a, cVar.f36084a) && Intrinsics.a(this.f36085b, cVar.f36085b) && Intrinsics.a(this.f36086c, cVar.f36086c) && Intrinsics.a(this.f36087d, cVar.f36087d) && Intrinsics.a(this.f36088e, cVar.f36088e);
    }

    public final int hashCode() {
        return this.f36088e.hashCode() + h.g(this.f36087d, d.e(this.f36086c, h.g(this.f36085b, this.f36084a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScratchCards(title=");
        sb2.append(this.f36084a);
        sb2.append(", subText=");
        sb2.append(this.f36085b);
        sb2.append(", scratchCards=");
        sb2.append(this.f36086c);
        sb2.append(", discoveryTitle=");
        sb2.append(this.f36087d);
        sb2.append(", missionToolTipText=");
        return d.o(sb2, this.f36088e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f36084a);
        out.writeString(this.f36085b);
        Iterator p10 = a3.a.p(this.f36086c, out);
        while (p10.hasNext()) {
            ((b) p10.next()).writeToParcel(out, i10);
        }
        out.writeString(this.f36087d);
        out.writeString(this.f36088e);
    }
}
