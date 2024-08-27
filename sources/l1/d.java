package l1;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.a0;
import d2.w0;
import g7.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t.d0;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends iu.h implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i10) {
        super(0, obj, e.class, "invalidateNodes", "invalidateNodes()V", 0);
        this.f23885i = i10;
        switch (i10) {
            case 1:
                super(0, obj, androidx.compose.ui.focus.b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
                return;
            case 2:
                super(0, obj, w0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
                return;
            case 3:
                super(0, obj, a0.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
                return;
            case 4:
                super(0, obj, x1.class, "refresh", "refresh()V", 0);
                return;
            case 5:
                super(0, obj, x1.class, "invalidate", "invalidate()V", 0);
                return;
            case 6:
                super(0, obj, x1.class, "invalidate", "invalidate()V", 0);
                return;
            default:
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        ContentCaptureSession a10;
        switch (this.f23885i) {
            case 0:
                j();
                return Unit.f23355a;
            case 1:
                j();
                return Unit.f23355a;
            case 2:
                View view = (View) this.f20539b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    f2.g.a(view, 1);
                }
                if (i10 < 29 || (a10 = f2.f.a(view)) == null) {
                    return null;
                }
                return new f2.d(a10, view);
            case 3:
                j();
                return Unit.f23355a;
            case 4:
                j();
                return Unit.f23355a;
            case 5:
                j();
                return Unit.f23355a;
            default:
                j();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        s sVar;
        d0 d0Var;
        d0 d0Var2;
        e eVar;
        Object[] objArr;
        long[] jArr;
        s sVar2;
        d0 d0Var3;
        Object[] objArr2;
        d0 d0Var4;
        e eVar2;
        long[] jArr2;
        s sVar3;
        s sVar4;
        v0.h hVar;
        v0.h hVar2;
        d0 d0Var5;
        d0 d0Var6;
        e eVar3;
        d0 d0Var7;
        int i10;
        v0.h hVar3;
        Object[] objArr3;
        long[] jArr3;
        s sVar5;
        Object[] objArr4;
        long[] jArr4;
        int i11;
        v0.h hVar4;
        v0.h hVar5;
        Object[] objArr5;
        s sVar6;
        long[] jArr5;
        s sVar7;
        int i12;
        v0.h hVar6;
        s sVar8 = s.f23920c;
        int i13 = this.f23885i;
        Object obj = this.f20539b;
        switch (i13) {
            case 0:
                e eVar4 = (e) obj;
                d0 d0Var8 = eVar4.f23890e;
                Object[] objArr6 = d0Var8.f34863b;
                long[] jArr6 = d0Var8.f34862a;
                int length = jArr6.length - 2;
                char c10 = 7;
                d0 d0Var9 = eVar4.f23888c;
                int i14 = 8;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr6[i15];
                        if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    g1.n nVar = (g1.n) ((m) objArr6[(i15 << 3) + i17]);
                                    g1.n nVar2 = nVar.f16405a;
                                    if (nVar2.f16417m) {
                                        v0.h hVar7 = null;
                                        while (nVar2 != null) {
                                            v0.h hVar8 = hVar7;
                                            if (nVar2 instanceof t) {
                                                d0Var9.d((t) nVar2);
                                            } else if ((nVar2.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar2 instanceof c2.o)) {
                                                g1.n nVar3 = ((c2.o) nVar2).f7801o;
                                                objArr5 = objArr6;
                                                int i18 = 0;
                                                while (nVar3 != null) {
                                                    long[] jArr7 = jArr6;
                                                    if ((nVar3.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                        i18++;
                                                        if (i18 == 1) {
                                                            nVar2 = nVar3;
                                                        } else {
                                                            if (hVar8 == null) {
                                                                sVar7 = sVar8;
                                                                i12 = i18;
                                                                hVar6 = new v0.h(new g1.n[16]);
                                                            } else {
                                                                sVar7 = sVar8;
                                                                i12 = i18;
                                                                hVar6 = hVar8;
                                                            }
                                                            if (nVar2 != null) {
                                                                hVar6.b(nVar2);
                                                                nVar2 = null;
                                                            }
                                                            hVar6.b(nVar3);
                                                            hVar8 = hVar6;
                                                            i18 = i12;
                                                            nVar3 = nVar3.f16410f;
                                                            jArr6 = jArr7;
                                                            sVar8 = sVar7;
                                                        }
                                                    }
                                                    sVar7 = sVar8;
                                                    nVar3 = nVar3.f16410f;
                                                    jArr6 = jArr7;
                                                    sVar8 = sVar7;
                                                }
                                                sVar6 = sVar8;
                                                jArr5 = jArr6;
                                                if (i18 == 1) {
                                                    hVar7 = hVar8;
                                                    objArr6 = objArr5;
                                                    jArr6 = jArr5;
                                                    sVar8 = sVar6;
                                                }
                                                hVar7 = hVar8;
                                                nVar2 = c2.g.f(hVar7);
                                                objArr6 = objArr5;
                                                jArr6 = jArr5;
                                                sVar8 = sVar6;
                                            }
                                            sVar6 = sVar8;
                                            objArr5 = objArr6;
                                            jArr5 = jArr6;
                                            hVar7 = hVar8;
                                            nVar2 = c2.g.f(hVar7);
                                            objArr6 = objArr5;
                                            jArr6 = jArr5;
                                            sVar8 = sVar6;
                                        }
                                        sVar5 = sVar8;
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                        g1.n nVar4 = nVar.f16405a;
                                        if (nVar4.f16417m) {
                                            v0.h hVar9 = new v0.h(new g1.n[16]);
                                            g1.n nVar5 = nVar4.f16410f;
                                            if (nVar5 == null) {
                                                c2.g.b(hVar9, nVar4);
                                            } else {
                                                hVar9.b(nVar5);
                                            }
                                            while (hVar9.l()) {
                                                g1.n nVar6 = (g1.n) hVar9.n(hVar9.f37655c - 1);
                                                if ((nVar6.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                                                    c2.g.b(hVar9, nVar6);
                                                } else {
                                                    while (true) {
                                                        if (nVar6 == null) {
                                                            break;
                                                        }
                                                        if ((nVar6.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                            v0.h hVar10 = null;
                                                            while (nVar6 != null) {
                                                                if (nVar6 instanceof t) {
                                                                    d0Var9.d((t) nVar6);
                                                                } else if ((nVar6.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar6 instanceof c2.o)) {
                                                                    g1.n nVar7 = ((c2.o) nVar6).f7801o;
                                                                    int i19 = 0;
                                                                    while (nVar7 != null) {
                                                                        if ((nVar7.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                                            i19++;
                                                                            if (i19 == 1) {
                                                                                hVar5 = hVar9;
                                                                                nVar6 = nVar7;
                                                                            } else {
                                                                                if (hVar10 == null) {
                                                                                    hVar5 = hVar9;
                                                                                    hVar10 = new v0.h(new g1.n[16]);
                                                                                } else {
                                                                                    hVar5 = hVar9;
                                                                                }
                                                                                if (nVar6 != null) {
                                                                                    hVar10.b(nVar6);
                                                                                    nVar6 = null;
                                                                                }
                                                                                hVar10.b(nVar7);
                                                                            }
                                                                        } else {
                                                                            hVar5 = hVar9;
                                                                        }
                                                                        nVar7 = nVar7.f16410f;
                                                                        hVar9 = hVar5;
                                                                    }
                                                                    hVar4 = hVar9;
                                                                    if (i19 == 1) {
                                                                        hVar9 = hVar4;
                                                                    }
                                                                    nVar6 = c2.g.f(hVar10);
                                                                    hVar9 = hVar4;
                                                                }
                                                                hVar4 = hVar9;
                                                                nVar6 = c2.g.f(hVar10);
                                                                hVar9 = hVar4;
                                                            }
                                                        } else {
                                                            nVar6 = nVar6.f16410f;
                                                            hVar9 = hVar9;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                        }
                                    } else {
                                        sVar5 = sVar8;
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                    }
                                    i11 = 8;
                                } else {
                                    sVar5 = sVar8;
                                    objArr4 = objArr6;
                                    jArr4 = jArr6;
                                    i11 = i14;
                                }
                                j10 >>= i11;
                                i17++;
                                i14 = i11;
                                objArr6 = objArr4;
                                jArr6 = jArr4;
                                sVar8 = sVar5;
                            }
                            sVar = sVar8;
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                            if (i16 != i14) {
                            }
                        } else {
                            sVar = sVar8;
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                        }
                        if (i15 != length) {
                            i15++;
                            objArr6 = objArr3;
                            jArr6 = jArr3;
                            sVar8 = sVar;
                            c10 = 7;
                            i14 = 8;
                        }
                    }
                } else {
                    sVar = sVar8;
                }
                d0Var8.e();
                d0 d0Var10 = eVar4.f23889d;
                Object[] objArr7 = d0Var10.f34863b;
                long[] jArr8 = d0Var10.f34862a;
                int length2 = jArr8.length - 2;
                d0 d0Var11 = eVar4.f23891f;
                if (length2 >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j11 = jArr8[i20];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i21 = 8 - ((~(i20 - length2)) >>> 31);
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j11 & 255) < 128) {
                                    c cVar = (c) objArr7[(i20 << 3) + i22];
                                    g1.n nVar8 = (g1.n) cVar;
                                    objArr2 = objArr7;
                                    g1.n nVar9 = nVar8.f16405a;
                                    jArr2 = jArr8;
                                    if (!nVar9.f16417m) {
                                        s sVar9 = sVar;
                                        cVar.i(sVar9);
                                        d0Var3 = d0Var10;
                                        d0Var4 = d0Var8;
                                        eVar2 = eVar4;
                                        sVar3 = sVar9;
                                    } else {
                                        s sVar10 = sVar;
                                        boolean z10 = false;
                                        boolean z11 = true;
                                        t tVar = null;
                                        v0.h hVar11 = null;
                                        while (nVar9 != null) {
                                            s sVar11 = sVar10;
                                            if (nVar9 instanceof t) {
                                                t tVar2 = (t) nVar9;
                                                if (tVar != null) {
                                                    z10 = true;
                                                }
                                                if (d0Var9.a(tVar2)) {
                                                    d0Var11.d(tVar2);
                                                    z11 = false;
                                                }
                                                d0Var5 = d0Var10;
                                                tVar = tVar2;
                                            } else if ((nVar9.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar9 instanceof c2.o)) {
                                                g1.n nVar10 = ((c2.o) nVar9).f7801o;
                                                d0Var6 = d0Var8;
                                                int i23 = 0;
                                                while (nVar10 != null) {
                                                    e eVar5 = eVar4;
                                                    if ((nVar10.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                        i23++;
                                                        if (i23 == 1) {
                                                            d0Var7 = d0Var10;
                                                            nVar9 = nVar10;
                                                        } else {
                                                            if (hVar11 == null) {
                                                                d0Var7 = d0Var10;
                                                                i10 = i23;
                                                                hVar3 = new v0.h(new g1.n[16]);
                                                            } else {
                                                                d0Var7 = d0Var10;
                                                                i10 = i23;
                                                                hVar3 = hVar11;
                                                            }
                                                            if (nVar9 != null) {
                                                                hVar3.b(nVar9);
                                                                nVar9 = null;
                                                            }
                                                            hVar3.b(nVar10);
                                                            hVar11 = hVar3;
                                                            i23 = i10;
                                                        }
                                                    } else {
                                                        d0Var7 = d0Var10;
                                                    }
                                                    nVar10 = nVar10.f16410f;
                                                    eVar4 = eVar5;
                                                    d0Var10 = d0Var7;
                                                }
                                                d0Var5 = d0Var10;
                                                eVar3 = eVar4;
                                                if (i23 == 1) {
                                                    sVar10 = sVar11;
                                                    d0Var8 = d0Var6;
                                                    eVar4 = eVar3;
                                                    d0Var10 = d0Var5;
                                                }
                                                nVar9 = c2.g.f(hVar11);
                                                sVar10 = sVar11;
                                                d0Var8 = d0Var6;
                                                eVar4 = eVar3;
                                                d0Var10 = d0Var5;
                                            } else {
                                                d0Var5 = d0Var10;
                                            }
                                            d0Var6 = d0Var8;
                                            eVar3 = eVar4;
                                            nVar9 = c2.g.f(hVar11);
                                            sVar10 = sVar11;
                                            d0Var8 = d0Var6;
                                            eVar4 = eVar3;
                                            d0Var10 = d0Var5;
                                        }
                                        d0Var3 = d0Var10;
                                        d0Var4 = d0Var8;
                                        eVar2 = eVar4;
                                        sVar3 = sVar10;
                                        g1.n nVar11 = nVar8.f16405a;
                                        if (nVar11.f16417m) {
                                            v0.h hVar12 = new v0.h(new g1.n[16]);
                                            g1.n nVar12 = nVar11.f16410f;
                                            if (nVar12 == null) {
                                                c2.g.b(hVar12, nVar11);
                                            } else {
                                                hVar12.b(nVar12);
                                            }
                                            while (hVar12.l()) {
                                                g1.n nVar13 = (g1.n) hVar12.n(hVar12.f37655c - 1);
                                                if ((nVar13.f16408d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                                                    c2.g.b(hVar12, nVar13);
                                                } else {
                                                    while (nVar13 != null) {
                                                        if ((nVar13.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                            v0.h hVar13 = null;
                                                            while (nVar13 != null) {
                                                                if (nVar13 instanceof t) {
                                                                    t tVar3 = (t) nVar13;
                                                                    if (tVar != null) {
                                                                        z10 = true;
                                                                    }
                                                                    if (d0Var9.a(tVar3)) {
                                                                        d0Var11.d(tVar3);
                                                                        z11 = false;
                                                                    }
                                                                    tVar = tVar3;
                                                                } else if ((nVar13.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (nVar13 instanceof c2.o)) {
                                                                    g1.n nVar14 = ((c2.o) nVar13).f7801o;
                                                                    int i24 = 0;
                                                                    while (nVar14 != null) {
                                                                        if ((nVar14.f16407c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                                            i24++;
                                                                            if (i24 == 1) {
                                                                                hVar2 = hVar12;
                                                                                nVar13 = nVar14;
                                                                            } else {
                                                                                if (hVar13 == null) {
                                                                                    hVar2 = hVar12;
                                                                                    hVar13 = new v0.h(new g1.n[16]);
                                                                                } else {
                                                                                    hVar2 = hVar12;
                                                                                }
                                                                                if (nVar13 != null) {
                                                                                    hVar13.b(nVar13);
                                                                                    nVar13 = null;
                                                                                }
                                                                                hVar13.b(nVar14);
                                                                                nVar14 = nVar14.f16410f;
                                                                                hVar12 = hVar2;
                                                                            }
                                                                        } else {
                                                                            hVar2 = hVar12;
                                                                        }
                                                                        nVar14 = nVar14.f16410f;
                                                                        hVar12 = hVar2;
                                                                    }
                                                                    hVar = hVar12;
                                                                    if (i24 == 1) {
                                                                        hVar12 = hVar;
                                                                    }
                                                                    nVar13 = c2.g.f(hVar13);
                                                                    hVar12 = hVar;
                                                                }
                                                                hVar = hVar12;
                                                                nVar13 = c2.g.f(hVar13);
                                                                hVar12 = hVar;
                                                            }
                                                        } else {
                                                            nVar13 = nVar13.f16410f;
                                                            hVar12 = hVar12;
                                                        }
                                                    }
                                                }
                                                hVar12 = hVar12;
                                            }
                                            if (z11) {
                                                if (z10) {
                                                    sVar4 = androidx.compose.ui.focus.a.p(cVar);
                                                } else if (tVar != null) {
                                                    sVar4 = tVar.R0();
                                                } else {
                                                    sVar4 = sVar3;
                                                }
                                                cVar.i(sVar4);
                                            }
                                            j11 >>= 8;
                                            i22++;
                                            objArr7 = objArr2;
                                            jArr8 = jArr2;
                                            sVar = sVar3;
                                            d0Var8 = d0Var4;
                                            eVar4 = eVar2;
                                            d0Var10 = d0Var3;
                                        } else {
                                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                        }
                                    }
                                } else {
                                    d0Var3 = d0Var10;
                                    objArr2 = objArr7;
                                    d0Var4 = d0Var8;
                                    eVar2 = eVar4;
                                    jArr2 = jArr8;
                                    sVar3 = sVar;
                                }
                                j11 >>= 8;
                                i22++;
                                objArr7 = objArr2;
                                jArr8 = jArr2;
                                sVar = sVar3;
                                d0Var8 = d0Var4;
                                eVar4 = eVar2;
                                d0Var10 = d0Var3;
                            }
                            d0Var = d0Var10;
                            objArr = objArr7;
                            d0Var2 = d0Var8;
                            eVar = eVar4;
                            jArr = jArr8;
                            sVar2 = sVar;
                            if (i21 != 8) {
                            }
                        } else {
                            d0Var = d0Var10;
                            objArr = objArr7;
                            d0Var2 = d0Var8;
                            eVar = eVar4;
                            jArr = jArr8;
                            sVar2 = sVar;
                        }
                        if (i20 != length2) {
                            i20++;
                            objArr7 = objArr;
                            jArr8 = jArr;
                            sVar = sVar2;
                            d0Var8 = d0Var2;
                            eVar4 = eVar;
                            d0Var10 = d0Var;
                        }
                    }
                } else {
                    d0Var = d0Var10;
                    d0Var2 = d0Var8;
                    eVar = eVar4;
                }
                d0Var.e();
                Object[] objArr8 = d0Var9.f34863b;
                long[] jArr9 = d0Var9.f34862a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j12 = jArr9[i25];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8 - ((~(i25 - length3)) >>> 31);
                            for (int i27 = 0; i27 < i26; i27++) {
                                if ((j12 & 255) < 128) {
                                    t tVar4 = (t) objArr8[(i25 << 3) + i27];
                                    if (tVar4.f16417m) {
                                        s R0 = tVar4.R0();
                                        tVar4.U0();
                                        if (R0 != tVar4.R0() || d0Var11.a(tVar4)) {
                                            androidx.compose.ui.focus.a.B(tVar4);
                                        }
                                    }
                                }
                                j12 >>= 8;
                            }
                            if (i26 != 8) {
                            }
                        }
                        if (i25 != length3) {
                            i25++;
                        }
                    }
                }
                d0Var9.e();
                d0Var11.e();
                eVar.f23887b.mo2invoke();
                if (d0Var2.b()) {
                    if (d0Var.b()) {
                        if (d0Var9.b()) {
                            return;
                        }
                        t0.t.C0("Unprocessed FocusTarget nodes");
                        throw null;
                    }
                    t0.t.C0("Unprocessed FocusEvent nodes");
                    throw null;
                }
                t0.t.C0("Unprocessed FocusProperties nodes");
                throw null;
            case 1:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) obj;
                if (bVar.f1363d.R0() == sVar8) {
                    bVar.f1361b.mo2invoke();
                    return;
                }
                return;
            case 2:
            default:
                ((x1) obj).f17122d.B(Boolean.FALSE);
                return;
            case 3:
                a0 a0Var = (a0) obj;
                Class cls = a0.N0;
                if (a0Var.isFocused() || a0Var.hasFocus()) {
                    a0Var.clearFocus();
                    return;
                }
                return;
            case 4:
                ((x1) obj).f17122d.B(Boolean.TRUE);
                return;
            case 5:
                ((x1) obj).f17122d.B(Boolean.FALSE);
                return;
        }
    }
}
