package android.support.v4.media;

import android.os.Parcelable;
import b.e;
import b5.d1;
import b5.q;
import b5.q0;
import b5.r;
import e.k;
import m.m;
import m.p0;
import t0.k1;
import t0.l1;
import t0.m1;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f808a;

    public /* synthetic */ a(int i10) {
        this.f808a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, m.m] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View$BaseSavedState, m.p0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View$BaseSavedState, java.lang.Object, h4.m] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.support.v4.media.d, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r12) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f808a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new e[i10];
            case 5:
                return new e.a[i10];
            case 6:
                return new k[i10];
            case 7:
                return new m[i10];
            case 8:
                return new p0[i10];
            case 9:
                return new d0.d[i10];
            case 10:
                return new k1[i10];
            case 11:
                return new l1[i10];
            case 12:
                return new m1[i10];
            case 13:
                return new h4.m[i10];
            case 14:
                return new r[i10];
            case 15:
                return new q[i10];
            case 16:
                return new q0[i10];
            case 17:
                return new d1[i10];
            case 18:
                return new f5.a[i10];
            case 19:
                return new f5.b[i10];
            case 20:
                return new f5.c[i10];
            case 21:
                return new g6.a[i10];
            case 22:
                return new h6.a[i10];
            case 23:
                return new i6.a[i10];
            case 24:
                return new i6.b[i10];
            case 25:
                return new j6.b[i10];
            case 26:
                return new j6.c[i10];
            case 27:
                return new k6.a[i10];
            case 28:
                return new k6.b[i10];
            default:
                return new k6.c[i10];
        }
    }
}
