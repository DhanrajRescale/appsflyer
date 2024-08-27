package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f11904a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final d1 f11905b = new Object();

    public static String a(h hVar) {
        ek.u uVar = new ek.u(hVar, 20);
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i10 = 0; i10 < ((h) uVar.f15627b).size(); i10++) {
            byte b10 = ((h) uVar.f15627b).b(i10);
            if (b10 != 34) {
                if (b10 != 39) {
                    if (b10 != 92) {
                        switch (b10) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (b10 >= 32 && b10 <= 126) {
                                    sb2.append((char) b10);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((b10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((b10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((b10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
