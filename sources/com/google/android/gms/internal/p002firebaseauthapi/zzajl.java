package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzajl {
    public static final zzajl zza;
    public static final zzajl zzb;
    public static final zzajl zzc;
    public static final zzajl zzd;
    public static final zzajl zze;
    public static final zzajl zzf;
    public static final zzajl zzg;
    public static final zzajl zzh;
    public static final zzajl zzi;
    public static final zzajl zzj;
    public static final zzajl zzk;
    public static final zzajl zzl;
    public static final zzajl zzm;
    public static final zzajl zzn;
    public static final zzajl zzo;
    public static final zzajl zzp;
    public static final zzajl zzq;
    public static final zzajl zzr;
    private static final /* synthetic */ zzajl[] zzs;
    private final zzajm zzt;

    static {
        zzajl zzajlVar = new zzajl("DOUBLE", 0, zzajm.DOUBLE, 1);
        zza = zzajlVar;
        zzajl zzajlVar2 = new zzajl("FLOAT", 1, zzajm.FLOAT, 5);
        zzb = zzajlVar2;
        zzajm zzajmVar = zzajm.LONG;
        zzajl zzajlVar3 = new zzajl("INT64", 2, zzajmVar, 0);
        zzc = zzajlVar3;
        zzajl zzajlVar4 = new zzajl("UINT64", 3, zzajmVar, 0);
        zzd = zzajlVar4;
        zzajm zzajmVar2 = zzajm.INT;
        zzajl zzajlVar5 = new zzajl("INT32", 4, zzajmVar2, 0);
        zze = zzajlVar5;
        zzajl zzajlVar6 = new zzajl("FIXED64", 5, zzajmVar, 1);
        zzf = zzajlVar6;
        zzajl zzajlVar7 = new zzajl("FIXED32", 6, zzajmVar2, 5);
        zzg = zzajlVar7;
        zzajl zzajlVar8 = new zzajl("BOOL", 7, zzajm.BOOLEAN, 0);
        zzh = zzajlVar8;
        zzajl zzajlVar9 = new zzajl("STRING", 8, zzajm.STRING, 2);
        zzi = zzajlVar9;
        zzajm zzajmVar3 = zzajm.MESSAGE;
        zzajl zzajlVar10 = new zzajl("GROUP", 9, zzajmVar3, 3);
        zzj = zzajlVar10;
        zzajl zzajlVar11 = new zzajl("MESSAGE", 10, zzajmVar3, 2);
        zzk = zzajlVar11;
        zzajl zzajlVar12 = new zzajl("BYTES", 11, zzajm.BYTE_STRING, 2);
        zzl = zzajlVar12;
        zzajl zzajlVar13 = new zzajl("UINT32", 12, zzajmVar2, 0);
        zzm = zzajlVar13;
        zzajl zzajlVar14 = new zzajl("ENUM", 13, zzajm.ENUM, 0);
        zzn = zzajlVar14;
        zzajl zzajlVar15 = new zzajl("SFIXED32", 14, zzajmVar2, 5);
        zzo = zzajlVar15;
        zzajl zzajlVar16 = new zzajl("SFIXED64", 15, zzajmVar, 1);
        zzp = zzajlVar16;
        zzajl zzajlVar17 = new zzajl("SINT32", 16, zzajmVar2, 0);
        zzq = zzajlVar17;
        zzajl zzajlVar18 = new zzajl("SINT64", 17, zzajmVar, 0);
        zzr = zzajlVar18;
        zzs = new zzajl[]{zzajlVar, zzajlVar2, zzajlVar3, zzajlVar4, zzajlVar5, zzajlVar6, zzajlVar7, zzajlVar8, zzajlVar9, zzajlVar10, zzajlVar11, zzajlVar12, zzajlVar13, zzajlVar14, zzajlVar15, zzajlVar16, zzajlVar17, zzajlVar18};
    }

    private zzajl(String str, int i10, zzajm zzajmVar, int i11) {
        this.zzt = zzajmVar;
    }

    public static zzajl[] values() {
        return (zzajl[]) zzs.clone();
    }

    public final zzajm zza() {
        return this.zzt;
    }
}
