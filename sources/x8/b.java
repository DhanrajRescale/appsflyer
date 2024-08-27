package x8;

import android.graphics.Bitmap;
import bv.d0;
import bv.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import ut.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ut.g f40092a;

    /* renamed from: b, reason: collision with root package name */
    public final ut.g f40093b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40094c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40095d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40096e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f40097f;

    public b(e0 e0Var) {
        i iVar = i.f37392a;
        final int i10 = 0;
        this.f40092a = ut.h.b(new Function0(this) { // from class: x8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f40091b;

            {
                this.f40091b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo2invoke() {
                int i11 = i10;
                b bVar = this.f40091b;
                switch (i11) {
                    case 0:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    case 1:
                        String str = bVar.f40097f.get("Content-Type");
                        if (str == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str);
                    case 2:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    default:
                        String str2 = bVar.f40097f.get("Content-Type");
                        if (str2 == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str2);
                }
            }
        });
        final boolean z10 = true ? 1 : 0;
        this.f40093b = ut.h.b(new Function0(this) { // from class: x8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f40091b;

            {
                this.f40091b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo2invoke() {
                int i11 = z10;
                b bVar = this.f40091b;
                switch (i11) {
                    case 0:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    case 1:
                        String str = bVar.f40097f.get("Content-Type");
                        if (str == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str);
                    case 2:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    default:
                        String str2 = bVar.f40097f.get("Content-Type");
                        if (str2 == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str2);
                }
            }
        });
        this.f40094c = Long.parseLong(e0Var.w(Long.MAX_VALUE));
        this.f40095d = Long.parseLong(e0Var.w(Long.MAX_VALUE));
        this.f40096e = Integer.parseInt(e0Var.w(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(e0Var.w(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i11 = 0; i11 < parseInt; i11++) {
            String w10 = e0Var.w(Long.MAX_VALUE);
            Bitmap.Config[] configArr = d9.e.f14221a;
            int z11 = w.z(w10, ':', 0, false, 6);
            if (z11 != -1) {
                String substring = w10.substring(0, z11);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String obj = w.X(substring).toString();
                String substring2 = w10.substring(z11 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                builder.addUnsafeNonAscii(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(w10).toString());
            }
        }
        this.f40097f = builder.build();
    }

    public final void a(d0 d0Var) {
        long j10;
        d0Var.Y(this.f40094c);
        d0Var.r(10);
        d0Var.Y(this.f40095d);
        d0Var.r(10);
        if (this.f40096e) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        d0Var.Y(j10);
        d0Var.r(10);
        Headers headers = this.f40097f;
        d0Var.Y(headers.size());
        d0Var.r(10);
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0Var.y(headers.name(i10));
            d0Var.y(": ");
            d0Var.y(headers.value(i10));
            d0Var.r(10);
        }
    }

    public b(Response response) {
        i iVar = i.f37392a;
        final int i10 = 2;
        this.f40092a = ut.h.b(new Function0(this) { // from class: x8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f40091b;

            {
                this.f40091b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo2invoke() {
                int i11 = i10;
                b bVar = this.f40091b;
                switch (i11) {
                    case 0:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    case 1:
                        String str = bVar.f40097f.get("Content-Type");
                        if (str == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str);
                    case 2:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    default:
                        String str2 = bVar.f40097f.get("Content-Type");
                        if (str2 == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str2);
                }
            }
        });
        final int i11 = 3;
        this.f40093b = ut.h.b(new Function0(this) { // from class: x8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f40091b;

            {
                this.f40091b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo2invoke() {
                int i112 = i11;
                b bVar = this.f40091b;
                switch (i112) {
                    case 0:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    case 1:
                        String str = bVar.f40097f.get("Content-Type");
                        if (str == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str);
                    case 2:
                        return CacheControl.INSTANCE.parse(bVar.f40097f);
                    default:
                        String str2 = bVar.f40097f.get("Content-Type");
                        if (str2 == null) {
                            return null;
                        }
                        return MediaType.INSTANCE.parse(str2);
                }
            }
        });
        this.f40094c = response.sentRequestAtMillis();
        this.f40095d = response.receivedResponseAtMillis();
        this.f40096e = response.handshake() != null;
        this.f40097f = response.headers();
    }
}
