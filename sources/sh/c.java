package sh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import hb.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new e(23);

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f34629a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("sub_text")
    @NotNull
    private final String f34630b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("items")
    private final List<b> f34631c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("discovery_title")
    private final String f34632d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("mission_tool_tip")
    private final String f34633e;

    public c(String title, String subText, ArrayList arrayList, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subText, "subText");
        this.f34629a = title;
        this.f34630b = subText;
        this.f34631c = arrayList;
        this.f34632d = str;
        this.f34633e = str2;
    }

    public final th.c a() {
        ArrayList arrayList;
        String str;
        String str2;
        String str3 = this.f34629a;
        String str4 = this.f34630b;
        List<b> list = this.f34631c;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((b) it.next()).a());
            }
        } else {
            arrayList = new ArrayList();
        }
        String str5 = this.f34632d;
        if (str5 == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = str5;
        }
        String str6 = this.f34633e;
        if (str6 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = str6;
        }
        return new th.c(str3, str4, arrayList, str, str2);
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
        return Intrinsics.a(this.f34629a, cVar.f34629a) && Intrinsics.a(this.f34630b, cVar.f34630b) && Intrinsics.a(this.f34631c, cVar.f34631c) && Intrinsics.a(this.f34632d, cVar.f34632d) && Intrinsics.a(this.f34633e, cVar.f34633e);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int g10 = h.g(this.f34630b, this.f34629a.hashCode() * 31, 31);
        List<b> list = this.f34631c;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str = this.f34632d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.f34633e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i12 + i10;
    }

    public final String toString() {
        String str = this.f34629a;
        String str2 = this.f34630b;
        List<b> list = this.f34631c;
        String str3 = this.f34632d;
        String str4 = this.f34633e;
        StringBuilder l10 = v.e.l("ScratchCardsDto(title=", str, ", subText=", str2, ", scratchCards=");
        l10.append(list);
        l10.append(", discoveryTitle=");
        l10.append(str3);
        l10.append(", missionToolTipText=");
        return d.o(l10, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f34629a);
        out.writeString(this.f34630b);
        List<b> list = this.f34631c;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator o10 = a3.a.o(out, 1, list);
            while (o10.hasNext()) {
                ((b) o10.next()).writeToParcel(out, i10);
            }
        }
        out.writeString(this.f34632d);
        out.writeString(this.f34633e);
    }
}
