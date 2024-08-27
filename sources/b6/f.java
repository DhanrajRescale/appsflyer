package b6;

import b5.u;
import b5.v;
import e5.m;
import e5.p;
import e5.x;
import java.util.Arrays;
import kp.j;
import lp.j1;
import lp.l0;
import lp.o0;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f3739a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3740b;

    public f(int i10, j1 j1Var) {
        this.f3740b = i10;
        this.f3739a = j1Var;
    }

    public static f c(int i10, p pVar) {
        String str;
        String str2;
        a cVar;
        int i11;
        int i12 = 4;
        j.A(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i13 = pVar.f15038c;
        int i14 = 0;
        int i15 = -2;
        int i16 = 0;
        while (pVar.a() > 8) {
            int i17 = pVar.i();
            int i18 = pVar.f15037b + pVar.i();
            pVar.E(i18);
            if (i17 == 1414744396) {
                cVar = c(pVar.i(), pVar);
            } else {
                g gVar = null;
                switch (i17) {
                    case 1718776947:
                        if (i15 == 2) {
                            pVar.G(i12);
                            int i19 = pVar.i();
                            int i20 = pVar.i();
                            pVar.G(i12);
                            int i21 = pVar.i();
                            switch (i21) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                nn.d.u("Ignoring track with unsupported compression ", i21, "StreamFormatChunk");
                                break;
                            } else {
                                u uVar = new u();
                                uVar.f3605p = i19;
                                uVar.f3606q = i20;
                                uVar.f3600k = str2;
                                gVar = new g(new v(uVar));
                                break;
                            }
                        } else if (i15 == 1) {
                            int n10 = pVar.n();
                            if (n10 == 1) {
                                str = "audio/raw";
                            } else if (n10 != 85) {
                                if (n10 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n10 != 8192) {
                                    if (n10 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                nn.d.u("Ignoring track with unsupported format tag ", n10, "StreamFormatChunk");
                                break;
                            } else {
                                int n11 = pVar.n();
                                int i22 = pVar.i();
                                pVar.G(6);
                                int t10 = x.t(pVar.z());
                                int n12 = pVar.n();
                                byte[] bArr = new byte[n12];
                                pVar.e(bArr, i14, n12);
                                u uVar2 = new u();
                                uVar2.f3600k = str;
                                uVar2.f3613x = n11;
                                uVar2.f3614y = i22;
                                if ("audio/raw".equals(str) && t10 != 0) {
                                    uVar2.f3615z = t10;
                                }
                                if ("audio/mp4a-latm".equals(str) && n12 > 0) {
                                    uVar2.f3602m = o0.v(bArr);
                                }
                                gVar = new g(new v(uVar2));
                                break;
                            }
                        } else {
                            m.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + x.z(i15));
                            break;
                        }
                    case 1751742049:
                        int i23 = pVar.i();
                        pVar.G(8);
                        int i24 = pVar.i();
                        int i25 = pVar.i();
                        pVar.G(i12);
                        pVar.i();
                        pVar.G(12);
                        cVar = new c(i23, i24, i25);
                        break;
                    case 1752331379:
                        int i26 = pVar.i();
                        pVar.G(12);
                        pVar.i();
                        int i27 = pVar.i();
                        int i28 = pVar.i();
                        pVar.G(i12);
                        int i29 = pVar.i();
                        int i30 = pVar.i();
                        pVar.G(8);
                        cVar = new d(i26, i27, i28, i29, i30);
                        break;
                    case 1852994675:
                        cVar = new h(pVar.s(pVar.a(), kp.e.f23433c));
                        break;
                }
                cVar = gVar;
            }
            if (cVar != null) {
                if (cVar.a() == 1752331379) {
                    int i31 = ((d) cVar).f3722a;
                    if (i31 != 1935960438) {
                        if (i31 != 1935963489) {
                            if (i31 != 1937012852) {
                                m.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i31));
                                i11 = -1;
                            } else {
                                i11 = 3;
                            }
                            i15 = i11;
                        } else {
                            i15 = 1;
                        }
                    } else {
                        i15 = 2;
                    }
                }
                int i32 = i16 + 1;
                if (objArr.length < i32) {
                    objArr = Arrays.copyOf(objArr, bl.j.z(objArr.length, i32));
                }
                objArr[i16] = cVar;
                i16 = i32;
            }
            pVar.F(i18);
            pVar.E(i13);
            i12 = 4;
            i14 = 0;
        }
        return new f(i10, o0.o(i16, objArr));
    }

    @Override // b6.a
    public final int a() {
        return this.f3740b;
    }

    public final a b(Class cls) {
        l0 listIterator = this.f3739a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
