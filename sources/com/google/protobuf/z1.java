package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f12005c;

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f12006d;

    /* renamed from: e, reason: collision with root package name */
    public static final w1 f12007e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z1[] f12008f;

    /* renamed from: a, reason: collision with root package name */
    public final a2 f12009a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12010b;

    /* JADX INFO: Fake field, exist only in values array */
    z1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    z1 EF1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.protobuf.z1, com.google.protobuf.v1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.protobuf.z1, com.google.protobuf.w1] */
    static {
        z1 z1Var = new z1("DOUBLE", 0, a2.DOUBLE, 1);
        z1 z1Var2 = new z1("FLOAT", 1, a2.FLOAT, 5);
        a2 a2Var = a2.LONG;
        z1 z1Var3 = new z1("INT64", 2, a2Var, 0);
        f12005c = z1Var3;
        z1 z1Var4 = new z1("UINT64", 3, a2Var, 0);
        a2 a2Var2 = a2.INT;
        z1 z1Var5 = new z1("INT32", 4, a2Var2, 0);
        z1 z1Var6 = new z1("FIXED64", 5, a2Var, 1);
        z1 z1Var7 = new z1("FIXED32", 6, a2Var2, 5);
        z1 z1Var8 = new z1("BOOL", 7, a2.BOOLEAN, 0);
        ?? z1Var9 = new z1("STRING", 8, a2.STRING, 2);
        f12006d = z1Var9;
        a2 a2Var3 = a2.MESSAGE;
        ?? z1Var10 = new z1("GROUP", 9, a2Var3, 3);
        f12007e = z1Var10;
        f12008f = new z1[]{z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, z1Var7, z1Var8, z1Var9, z1Var10, new z1("MESSAGE", 10, a2Var3, 2), new z1("BYTES", 11, a2.BYTE_STRING, 2), new z1("UINT32", 12, a2Var2, 0), new z1("ENUM", 13, a2.ENUM, 0), new z1("SFIXED32", 14, a2Var2, 5), new z1("SFIXED64", 15, a2Var, 1), new z1("SINT32", 16, a2Var2, 0), new z1("SINT64", 17, a2Var, 0)};
    }

    public z1(String str, int i10, a2 a2Var, int i11) {
        this.f12009a = a2Var;
        this.f12010b = i11;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) f12008f.clone();
    }
}
