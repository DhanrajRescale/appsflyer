package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new e(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f18224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18225b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18226c;

    /* renamed from: d, reason: collision with root package name */
    public final r f18227d;

    /* renamed from: e, reason: collision with root package name */
    public final j f18228e;

    /* renamed from: f, reason: collision with root package name */
    public final q f18229f;

    public s(String postId, String createdAt, String expiredAt, r header, j body, q footer) {
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expiredAt, "expiredAt");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f18224a = postId;
        this.f18225b = createdAt;
        this.f18226c = expiredAt;
        this.f18227d = header;
        this.f18228e = body;
        this.f18229f = footer;
    }

    public static s a(s sVar, r rVar, q qVar, int i10) {
        String postId;
        String createdAt;
        String expiredAt;
        j jVar = null;
        if ((i10 & 1) != 0) {
            postId = sVar.f18224a;
        } else {
            postId = null;
        }
        if ((i10 & 2) != 0) {
            createdAt = sVar.f18225b;
        } else {
            createdAt = null;
        }
        if ((i10 & 4) != 0) {
            expiredAt = sVar.f18226c;
        } else {
            expiredAt = null;
        }
        if ((i10 & 8) != 0) {
            rVar = sVar.f18227d;
        }
        r header = rVar;
        if ((i10 & 16) != 0) {
            jVar = sVar.f18228e;
        }
        j body = jVar;
        if ((i10 & 32) != 0) {
            qVar = sVar.f18229f;
        }
        q footer = qVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expiredAt, "expiredAt");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new s(postId, createdAt, expiredAt, header, body, footer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f18224a, sVar.f18224a) && Intrinsics.a(this.f18225b, sVar.f18225b) && Intrinsics.a(this.f18226c, sVar.f18226c) && Intrinsics.a(this.f18227d, sVar.f18227d) && Intrinsics.a(this.f18228e, sVar.f18228e) && Intrinsics.a(this.f18229f, sVar.f18229f);
    }

    public final int hashCode() {
        return this.f18229f.hashCode() + ((this.f18228e.hashCode() + ((this.f18227d.hashCode() + jr.h.g(this.f18226c, jr.h.g(this.f18225b, this.f18224a.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FeedPost(postId=" + this.f18224a + ", createdAt=" + this.f18225b + ", expiredAt=" + this.f18226c + ", header=" + this.f18227d + ", body=" + this.f18228e + ", footer=" + this.f18229f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18224a);
        out.writeString(this.f18225b);
        out.writeString(this.f18226c);
        this.f18227d.writeToParcel(out, i10);
        this.f18228e.writeToParcel(out, i10);
        this.f18229f.writeToParcel(out, i10);
    }
}
