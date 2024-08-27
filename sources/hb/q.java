package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new e(9);

    /* renamed from: a, reason: collision with root package name */
    public final p f18210a;

    /* renamed from: b, reason: collision with root package name */
    public final o f18211b;

    /* renamed from: c, reason: collision with root package name */
    public final m f18212c;

    /* renamed from: d, reason: collision with root package name */
    public final n f18213d;

    public q(p likes, o comments, m mVar, n bookmarks) {
        Intrinsics.checkNotNullParameter(likes, "likes");
        Intrinsics.checkNotNullParameter(comments, "comments");
        Intrinsics.checkNotNullParameter(bookmarks, "bookmarks");
        this.f18210a = likes;
        this.f18211b = comments;
        this.f18212c = mVar;
        this.f18213d = bookmarks;
    }

    public static q a(q qVar, p likes, o comments, n bookmarks, int i10) {
        m mVar;
        if ((i10 & 1) != 0) {
            likes = qVar.f18210a;
        }
        if ((i10 & 2) != 0) {
            comments = qVar.f18211b;
        }
        if ((i10 & 4) != 0) {
            mVar = qVar.f18212c;
        } else {
            mVar = null;
        }
        if ((i10 & 8) != 0) {
            bookmarks = qVar.f18213d;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(likes, "likes");
        Intrinsics.checkNotNullParameter(comments, "comments");
        Intrinsics.checkNotNullParameter(bookmarks, "bookmarks");
        return new q(likes, comments, mVar, bookmarks);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.a(this.f18210a, qVar.f18210a) && Intrinsics.a(this.f18211b, qVar.f18211b) && Intrinsics.a(this.f18212c, qVar.f18212c) && Intrinsics.a(this.f18213d, qVar.f18213d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f18211b.hashCode() + (this.f18210a.hashCode() * 31)) * 31;
        m mVar = this.f18212c;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        return Boolean.hashCode(this.f18213d.f18205a) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Footer(likes=" + this.f18210a + ", comments=" + this.f18211b + ", attachments=" + this.f18212c + ", bookmarks=" + this.f18213d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f18210a.writeToParcel(out, i10);
        this.f18211b.writeToParcel(out, i10);
        m mVar = this.f18212c;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i10);
        }
        this.f18213d.writeToParcel(out, i10);
    }
}
