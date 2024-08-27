package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f796a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f797b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f798c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f799d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f800e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f801f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f802g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f803h;

    /* renamed from: i, reason: collision with root package name */
    public MediaDescription f804i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f796a = str;
        this.f797b = charSequence;
        this.f798c = charSequence2;
        this.f799d = charSequence3;
        this.f800e = bitmap;
        this.f801f = uri;
        this.f802g = bundle;
        this.f803h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f797b) + ", " + ((Object) this.f798c) + ", " + ((Object) this.f799d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescription = this.f804i;
        if (mediaDescription == null) {
            MediaDescription.Builder b10 = b.b();
            b.n(b10, this.f796a);
            b.p(b10, this.f797b);
            b.o(b10, this.f798c);
            b.j(b10, this.f799d);
            b.l(b10, this.f800e);
            b.m(b10, this.f801f);
            b.k(b10, this.f802g);
            c.b(b10, this.f803h);
            mediaDescription = b.a(b10);
            this.f804i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }
}
