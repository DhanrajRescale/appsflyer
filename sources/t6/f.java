package t6;

import android.text.SpannableStringBuilder;
import b5.m;
import e5.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: g, reason: collision with root package name */
    public final p f35422g = new p();

    /* renamed from: h, reason: collision with root package name */
    public final m f35423h = new m();

    /* renamed from: i, reason: collision with root package name */
    public int f35424i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f35425j;

    /* renamed from: k, reason: collision with root package name */
    public final e[] f35426k;

    /* renamed from: l, reason: collision with root package name */
    public e f35427l;

    /* renamed from: m, reason: collision with root package name */
    public List f35428m;

    /* renamed from: n, reason: collision with root package name */
    public List f35429n;

    /* renamed from: o, reason: collision with root package name */
    public m f35430o;

    /* renamed from: p, reason: collision with root package name */
    public int f35431p;

    public f(int i10, List list) {
        this.f35425j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.f35426k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f35426k[i11] = new e();
        }
        this.f35427l = this.f35426k[0];
    }

    @Override // t6.i
    public final j e() {
        List list = this.f35428m;
        this.f35429n = list;
        list.getClass();
        return new j(0, list);
    }

    @Override // t6.i
    public final void f(g gVar) {
        boolean z10;
        ByteBuffer byteBuffer = gVar.f18002d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        p pVar = this.f35422g;
        pVar.D(limit, array);
        while (pVar.a() >= 3) {
            int u10 = pVar.u();
            int i10 = u10 & 3;
            boolean z11 = false;
            if ((u10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte u11 = (byte) pVar.u();
            byte u12 = (byte) pVar.u();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (u11 & 192) >> 6;
                        int i12 = this.f35424i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            k();
                            e5.m.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f35424i + " current=" + i11);
                        }
                        this.f35424i = i11;
                        int i13 = u11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        m mVar = new m(i11, i13);
                        this.f35430o = mVar;
                        byte[] bArr = mVar.f3433b;
                        int i14 = mVar.f3436e;
                        mVar.f3436e = i14 + 1;
                        bArr[i14] = u12;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        yk.j.E0(z11);
                        m mVar2 = this.f35430o;
                        if (mVar2 == null) {
                            e5.m.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = mVar2.f3433b;
                            int i15 = mVar2.f3436e;
                            bArr2[i15] = u11;
                            mVar2.f3436e = i15 + 2;
                            bArr2[i15 + 1] = u12;
                        }
                    }
                    m mVar3 = this.f35430o;
                    if (mVar3.f3436e == (mVar3.f3435d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // t6.i, h5.e
    public final void flush() {
        super.flush();
        this.f35428m = null;
        this.f35429n = null;
        this.f35431p = 0;
        this.f35427l = this.f35426k[0];
        k();
        this.f35430o = null;
    }

    @Override // t6.i
    public final boolean h() {
        return this.f35428m != this.f35429n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x014b. Please report as an issue. */
    public final void i() {
        int i10;
        int i11;
        String str;
        boolean z10;
        char c10;
        int i12;
        String str2;
        m mVar = this.f35430o;
        if (mVar == null) {
            return;
        }
        int i13 = 2;
        String str3 = "Cea708Decoder";
        if (mVar.f3436e != (mVar.f3435d * 2) - 1) {
            e5.m.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f35430o.f3435d * 2) - 1) + ", but current index is " + this.f35430o.f3436e + " (sequence number " + this.f35430o.f3434c + ");");
        }
        m mVar2 = this.f35430o;
        byte[] bArr = mVar2.f3433b;
        int i14 = mVar2.f3436e;
        m mVar3 = this.f35423h;
        mVar3.n(i14, bArr);
        boolean z11 = false;
        while (true) {
            if (mVar3.b() > 0) {
                int i15 = 3;
                int i16 = mVar3.i(3);
                int i17 = mVar3.i(5);
                if (i16 == 7) {
                    mVar3.s(i13);
                    i16 = mVar3.i(6);
                    if (i16 < 7) {
                        nn.d.u("Invalid extended service number: ", i16, str3);
                    }
                }
                if (i17 == 0) {
                    if (i16 != 0) {
                        e5.m.f(str3, "serviceNumber is non-zero (" + i16 + ") when blockSize is 0");
                    }
                } else if (i16 != this.f35425j) {
                    mVar3.t(i17);
                } else {
                    int g10 = (i17 * 8) + mVar3.g();
                    while (mVar3.g() < g10) {
                        int i18 = mVar3.i(8);
                        if (i18 != 16) {
                            if (i18 <= 31) {
                                if (i18 != 0) {
                                    if (i18 != i15) {
                                        if (i18 != 8) {
                                            switch (i18) {
                                                case 12:
                                                    k();
                                                    break;
                                                case 13:
                                                    this.f35427l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i18 >= 17 && i18 <= 23) {
                                                        e5.m.f(str3, "Currently unsupported COMMAND_EXT1 Command: " + i18);
                                                        mVar3.s(8);
                                                        break;
                                                    } else if (i18 >= 24 && i18 <= 31) {
                                                        e5.m.f(str3, "Currently unsupported COMMAND_P16 Command: " + i18);
                                                        mVar3.s(16);
                                                        break;
                                                    } else {
                                                        nn.d.u("Invalid C0 command: ", i18, str3);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f35427l.f35401b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f35428m = j();
                                    }
                                }
                                i12 = i13;
                                i10 = i15;
                                i11 = g10;
                            } else if (i18 <= 127) {
                                if (i18 == 127) {
                                    this.f35427l.a((char) 9835);
                                } else {
                                    this.f35427l.a((char) (i18 & 255));
                                }
                                i12 = i13;
                                i10 = i15;
                                i11 = g10;
                                z11 = true;
                            } else {
                                if (i18 <= 159) {
                                    e[] eVarArr = this.f35426k;
                                    switch (i18) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            z10 = true;
                                            int i19 = i18 - 128;
                                            if (this.f35431p != i19) {
                                                this.f35431p = i19;
                                                this.f35427l = eVarArr[i19];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            z10 = true;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (mVar3.h()) {
                                                    e eVar = eVarArr[8 - i20];
                                                    eVar.f35400a.clear();
                                                    eVar.f35401b.clear();
                                                    eVar.f35415p = -1;
                                                    eVar.f35416q = -1;
                                                    eVar.f35417r = -1;
                                                    eVar.f35419t = -1;
                                                    eVar.f35421v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (mVar3.h()) {
                                                    eVarArr[8 - i21].f35403d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (mVar3.h()) {
                                                    eVarArr[8 - i22].f35403d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (mVar3.h()) {
                                                    eVarArr[8 - i23].f35403d = !r1.f35403d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            for (int i24 = 1; i24 <= 8; i24++) {
                                                if (mVar3.h()) {
                                                    eVarArr[8 - i24].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            mVar3.s(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            z10 = true;
                                            break;
                                        case 143:
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            k();
                                            z10 = true;
                                            break;
                                        case 144:
                                            str2 = str3;
                                            i11 = g10;
                                            if (!this.f35427l.f35402c) {
                                                mVar3.s(16);
                                                i10 = 3;
                                                z10 = true;
                                                break;
                                            } else {
                                                mVar3.i(4);
                                                mVar3.i(2);
                                                mVar3.i(2);
                                                boolean h10 = mVar3.h();
                                                boolean h11 = mVar3.h();
                                                i10 = 3;
                                                mVar3.i(3);
                                                mVar3.i(3);
                                                this.f35427l.e(h10, h11);
                                                z10 = true;
                                            }
                                        case 145:
                                            str2 = str3;
                                            i11 = g10;
                                            if (!this.f35427l.f35402c) {
                                                mVar3.s(24);
                                            } else {
                                                int c11 = e.c(mVar3.i(2), mVar3.i(2), mVar3.i(2), mVar3.i(2));
                                                int c12 = e.c(mVar3.i(2), mVar3.i(2), mVar3.i(2), mVar3.i(2));
                                                mVar3.s(2);
                                                e.c(mVar3.i(2), mVar3.i(2), mVar3.i(2), 0);
                                                this.f35427l.f(c11, c12);
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                        case 146:
                                            str2 = str3;
                                            i11 = g10;
                                            if (!this.f35427l.f35402c) {
                                                mVar3.s(16);
                                            } else {
                                                mVar3.s(4);
                                                int i25 = mVar3.i(4);
                                                mVar3.s(2);
                                                mVar3.i(6);
                                                e eVar2 = this.f35427l;
                                                if (eVar2.f35421v != i25) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f35421v = i25;
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            nn.d.u("Invalid C1 command: ", i18, str3);
                                            str2 = str3;
                                            i10 = i15;
                                            i11 = g10;
                                            z10 = true;
                                            break;
                                        case 151:
                                            str2 = str3;
                                            i11 = g10;
                                            if (!this.f35427l.f35402c) {
                                                mVar3.s(32);
                                            } else {
                                                int c13 = e.c(mVar3.i(2), mVar3.i(2), mVar3.i(2), mVar3.i(2));
                                                mVar3.i(2);
                                                e.c(mVar3.i(2), mVar3.i(2), mVar3.i(2), 0);
                                                mVar3.h();
                                                mVar3.h();
                                                mVar3.i(2);
                                                mVar3.i(2);
                                                int i26 = mVar3.i(2);
                                                mVar3.s(8);
                                                e eVar3 = this.f35427l;
                                                eVar3.f35414o = c13;
                                                eVar3.f35411l = i26;
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i27 = i18 - 152;
                                            e eVar4 = eVarArr[i27];
                                            mVar3.s(i13);
                                            boolean h12 = mVar3.h();
                                            boolean h13 = mVar3.h();
                                            mVar3.h();
                                            int i28 = mVar3.i(i15);
                                            boolean h14 = mVar3.h();
                                            int i29 = mVar3.i(7);
                                            int i30 = mVar3.i(8);
                                            int i31 = mVar3.i(4);
                                            int i32 = mVar3.i(4);
                                            mVar3.s(i13);
                                            i11 = g10;
                                            mVar3.i(6);
                                            mVar3.s(i13);
                                            int i33 = mVar3.i(3);
                                            str2 = str3;
                                            int i34 = mVar3.i(3);
                                            eVar4.f35402c = true;
                                            eVar4.f35403d = h12;
                                            eVar4.f35410k = h13;
                                            eVar4.f35404e = i28;
                                            eVar4.f35405f = h14;
                                            eVar4.f35406g = i29;
                                            eVar4.f35407h = i30;
                                            eVar4.f35408i = i31;
                                            int i35 = i32 + 1;
                                            if (eVar4.f35409j != i35) {
                                                eVar4.f35409j = i35;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f35400a;
                                                    if ((h13 && arrayList.size() >= eVar4.f35409j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i33 != 0 && eVar4.f35412m != i33) {
                                                eVar4.f35412m = i33;
                                                int i36 = i33 - 1;
                                                int i37 = e.C[i36];
                                                boolean z12 = e.B[i36];
                                                int i38 = e.f35399z[i36];
                                                int i39 = e.A[i36];
                                                int i40 = e.f35398y[i36];
                                                eVar4.f35414o = i37;
                                                eVar4.f35411l = i40;
                                            }
                                            if (i34 != 0 && eVar4.f35413n != i34) {
                                                eVar4.f35413n = i34;
                                                int i41 = i34 - 1;
                                                int i42 = e.E[i41];
                                                int i43 = e.D[i41];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f35396w, e.F[i41]);
                                            }
                                            if (this.f35431p != i27) {
                                                this.f35431p = i27;
                                                this.f35427l = eVarArr[i27];
                                            }
                                            i10 = 3;
                                            z10 = true;
                                            break;
                                    }
                                } else {
                                    str2 = str3;
                                    i10 = i15;
                                    i11 = g10;
                                    z10 = true;
                                    if (i18 <= 255) {
                                        this.f35427l.a((char) (i18 & 255));
                                    } else {
                                        str = str2;
                                        nn.d.u("Invalid base command: ", i18, str);
                                        i12 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z10;
                                str = str2;
                                i12 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                            str = str3;
                            z10 = true;
                        } else {
                            i10 = i15;
                            i11 = g10;
                            str = str3;
                            z10 = true;
                            int i44 = mVar3.i(8);
                            if (i44 <= 31) {
                                c10 = 7;
                                if (i44 > 7) {
                                    if (i44 <= 15) {
                                        mVar3.s(8);
                                    } else if (i44 <= 23) {
                                        mVar3.s(16);
                                    } else if (i44 <= 31) {
                                        mVar3.s(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i44 <= 127) {
                                    if (i44 != 32) {
                                        if (i44 != 33) {
                                            if (i44 != 37) {
                                                if (i44 != 42) {
                                                    if (i44 != 44) {
                                                        if (i44 != 63) {
                                                            if (i44 != 57) {
                                                                if (i44 != 58) {
                                                                    if (i44 != 60) {
                                                                        if (i44 != 61) {
                                                                            switch (i44) {
                                                                                case 48:
                                                                                    this.f35427l.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f35427l.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f35427l.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f35427l.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f35427l.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f35427l.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (i44) {
                                                                                        case 118:
                                                                                            this.f35427l.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f35427l.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f35427l.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f35427l.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f35427l.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f35427l.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f35427l.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f35427l.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f35427l.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f35427l.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            nn.d.u("Invalid G2 character: ", i44, str);
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f35427l.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f35427l.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f35427l.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f35427l.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f35427l.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f35427l.a((char) 338);
                                                    }
                                                } else {
                                                    this.f35427l.a((char) 352);
                                                }
                                            } else {
                                                this.f35427l.a((char) 8230);
                                            }
                                        } else {
                                            this.f35427l.a((char) 160);
                                        }
                                    } else {
                                        this.f35427l.a(' ');
                                    }
                                    z11 = true;
                                } else if (i44 <= 159) {
                                    if (i44 <= 135) {
                                        mVar3.s(32);
                                    } else if (i44 <= 143) {
                                        mVar3.s(40);
                                    } else if (i44 <= 159) {
                                        i12 = 2;
                                        mVar3.s(2);
                                        mVar3.s(mVar3.i(6) * 8);
                                    }
                                } else {
                                    i12 = 2;
                                    if (i44 <= 255) {
                                        if (i44 == 160) {
                                            this.f35427l.a((char) 13252);
                                        } else {
                                            nn.d.u("Invalid G3 character: ", i44, str);
                                            this.f35427l.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        nn.d.u("Invalid extended command: ", i44, str);
                                    }
                                }
                            }
                            i12 = 2;
                        }
                        i15 = i10;
                        str3 = str;
                        g10 = i11;
                        i13 = i12;
                    }
                }
            }
        }
        if (z11) {
            this.f35428m = j();
        }
        this.f35430o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List j() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.f.j():java.util.List");
    }

    public final void k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f35426k[i10].d();
        }
    }
}
