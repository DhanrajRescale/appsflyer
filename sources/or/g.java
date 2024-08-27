package or;

/* loaded from: classes2.dex */
public final class g extends ll.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(22);
        this.f30287c = i10;
    }

    @Override // ll.f, or.b
    public final void c(c cVar) {
        int i10;
        int i11 = this.f30287c;
        switch (i11) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (cVar.b()) {
                        char a10 = cVar.a();
                        cVar.f30266d++;
                        h(a10, sb2);
                        int i12 = 3;
                        if (sb2.length() % 3 == 0) {
                            ll.f.v(cVar, sb2);
                            int i13 = cVar.f30266d;
                            switch (i11) {
                                case 0:
                                    i10 = 2;
                                    break;
                                default:
                                    i10 = 3;
                                    break;
                            }
                            int Y = zq.f.Y(cVar.f30263a, i13, i10);
                            switch (i11) {
                                case 0:
                                    i12 = 2;
                                default:
                                    if (Y == i12) {
                                        break;
                                    } else {
                                        cVar.f30267e = 0;
                                        break;
                                    }
                            }
                        }
                    }
                }
                o(cVar, sb2);
                return;
            default:
                super.c(cVar);
                return;
        }
    }

    @Override // ll.f
    public final int h(char c10, StringBuilder sb2) {
        switch (this.f30287c) {
            case 0:
                if (c10 == ' ') {
                    sb2.append((char) 3);
                } else if (c10 >= '0' && c10 <= '9') {
                    sb2.append((char) (c10 - ','));
                } else if (c10 >= 'a' && c10 <= 'z') {
                    sb2.append((char) (c10 - 'S'));
                } else {
                    if (c10 < ' ') {
                        sb2.append((char) 0);
                        sb2.append(c10);
                        return 2;
                    }
                    if (c10 >= '!' && c10 <= '/') {
                        sb2.append((char) 1);
                        sb2.append((char) (c10 - '!'));
                        return 2;
                    }
                    if (c10 >= ':' && c10 <= '@') {
                        sb2.append((char) 1);
                        sb2.append((char) (c10 - '+'));
                        return 2;
                    }
                    if (c10 >= '[' && c10 <= '_') {
                        sb2.append((char) 1);
                        sb2.append((char) (c10 - 'E'));
                        return 2;
                    }
                    if (c10 == '`') {
                        sb2.append((char) 2);
                        sb2.append((char) (c10 - '`'));
                        return 2;
                    }
                    if (c10 >= 'A' && c10 <= 'Z') {
                        sb2.append((char) 2);
                        sb2.append((char) (c10 - '@'));
                        return 2;
                    }
                    if (c10 >= '{' && c10 <= 127) {
                        sb2.append((char) 2);
                        sb2.append((char) (c10 - '`'));
                        return 2;
                    }
                    sb2.append("\u0001\u001e");
                    return 2 + h((char) (c10 - 128), sb2);
                }
                return 1;
            default:
                if (c10 != '\r') {
                    if (c10 != ' ') {
                        if (c10 != '*') {
                            if (c10 != '>') {
                                if (c10 >= '0' && c10 <= '9') {
                                    sb2.append((char) (c10 - ','));
                                } else if (c10 >= 'A' && c10 <= 'Z') {
                                    sb2.append((char) (c10 - '3'));
                                } else {
                                    zq.f.N(c10);
                                    throw null;
                                }
                            } else {
                                sb2.append((char) 2);
                            }
                        } else {
                            sb2.append((char) 1);
                        }
                    } else {
                        sb2.append((char) 3);
                    }
                } else {
                    sb2.append((char) 0);
                }
                return 1;
        }
    }

    @Override // ll.f
    public final int l() {
        switch (this.f30287c) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // ll.f
    public final void o(c cVar, StringBuilder sb2) {
        switch (this.f30287c) {
            case 1:
                StringBuilder sb3 = cVar.f30265c;
                cVar.c(sb3.length());
                int length = cVar.f30268f.f30276b - sb3.length();
                cVar.f30266d -= sb2.length();
                String str = cVar.f30263a;
                if ((str.length() - cVar.f30269g) - cVar.f30266d > 1 || length > 1 || (str.length() - cVar.f30269g) - cVar.f30266d != length) {
                    cVar.d((char) 254);
                }
                if (cVar.f30267e < 0) {
                    cVar.f30267e = 0;
                    return;
                }
                return;
            default:
                super.o(cVar, sb2);
                return;
        }
    }
}
