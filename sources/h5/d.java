package h5;

import android.media.MediaCodec;
import e5.x;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17991a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f17992b;

    /* renamed from: c, reason: collision with root package name */
    public int f17993c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f17994d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f17995e;

    /* renamed from: f, reason: collision with root package name */
    public int f17996f;

    /* renamed from: g, reason: collision with root package name */
    public int f17997g;

    /* renamed from: h, reason: collision with root package name */
    public int f17998h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f17999i;

    /* renamed from: j, reason: collision with root package name */
    public final c f18000j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17999i = cryptoInfo;
        if (x.f15050a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18000j = cVar;
    }
}
