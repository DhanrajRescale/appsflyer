package d6;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import b4.l;
import b5.m;
import b5.u;
import b5.v;
import e5.g;
import e5.p;
import java.util.Collections;
import z5.b0;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13927f = {5512, 11025, 22050, 44100};

    /* renamed from: c, reason: collision with root package name */
    public boolean f13928c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13929d;

    /* renamed from: e, reason: collision with root package name */
    public int f13930e;

    public final boolean h(p pVar) {
        String str;
        if (!this.f13928c) {
            int u10 = pVar.u();
            int i10 = (u10 >> 4) & 15;
            this.f13930e = i10;
            if (i10 == 2) {
                int i11 = f13927f[(u10 >> 2) & 3];
                u uVar = new u();
                uVar.f3600k = "audio/mpeg";
                uVar.f3613x = 1;
                uVar.f3614y = i11;
                ((b0) this.f3178b).e(uVar.a());
                this.f13929d = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new TagPayloadReader$UnsupportedFormatException("Audio format not supported: " + this.f13930e);
                }
            } else {
                if (i10 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                u uVar2 = new u();
                uVar2.f3600k = str;
                uVar2.f3613x = 1;
                uVar2.f3614y = 8000;
                ((b0) this.f3178b).e(uVar2.a());
                this.f13929d = true;
            }
            this.f13928c = true;
        } else {
            pVar.G(1);
        }
        return true;
    }

    public final boolean i(long j10, p pVar) {
        if (this.f13930e == 2) {
            int a10 = pVar.a();
            ((b0) this.f3178b).c(a10, pVar);
            ((b0) this.f3178b).b(j10, 1, a10, 0, null);
            return true;
        }
        int u10 = pVar.u();
        if (u10 == 0 && !this.f13929d) {
            int a11 = pVar.a();
            byte[] bArr = new byte[a11];
            pVar.e(bArr, 0, a11);
            g f10 = z5.a.f(new m(bArr, 1, (Object) null), false);
            u uVar = new u();
            uVar.f3600k = "audio/mp4a-latm";
            uVar.f3597h = f10.f15019c;
            uVar.f3613x = f10.f15018b;
            uVar.f3614y = f10.f15017a;
            uVar.f3602m = Collections.singletonList(bArr);
            ((b0) this.f3178b).e(new v(uVar));
            this.f13929d = true;
            return false;
        }
        if (this.f13930e == 10 && u10 != 1) {
            return false;
        }
        int a12 = pVar.a();
        ((b0) this.f3178b).c(a12, pVar);
        ((b0) this.f3178b).b(j10, 1, a12, 0, null);
        return true;
    }
}
