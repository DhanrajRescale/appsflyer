package com.google.android.gms.internal.p002firebaseauthapi;

import okhttp3.HttpUrl;
import s0.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzagt {
    public static final zzagt zza;
    public static final zzagt zzb;
    public static final zzagt zzc;
    public static final zzagt zzd;
    public static final zzagt zze;
    public static final zzagt zzf;
    public static final zzagt zzg;
    public static final zzagt zzh;
    public static final zzagt zzi;
    public static final zzagt zzj;
    private static final /* synthetic */ zzagt[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzagt zzagtVar = new zzagt("VOID", 0, Void.class, Void.class, null);
        zza = zzagtVar;
        Class cls = Integer.TYPE;
        zzagt zzagtVar2 = new zzagt("INT", 1, cls, Integer.class, 0);
        zzb = zzagtVar2;
        zzagt zzagtVar3 = new zzagt("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzagtVar3;
        zzagt zzagtVar4 = new zzagt("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(g.f34069a));
        zzd = zzagtVar4;
        zzagt zzagtVar5 = new zzagt("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzagtVar5;
        zzagt zzagtVar6 = new zzagt("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzagtVar6;
        zzagt zzagtVar7 = new zzagt("STRING", 6, String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET);
        zzg = zzagtVar7;
        zzagt zzagtVar8 = new zzagt("BYTE_STRING", 7, zzaff.class, zzaff.class, zzaff.zzb);
        zzh = zzagtVar8;
        zzagt zzagtVar9 = new zzagt("ENUM", 8, cls, Integer.class, null);
        zzi = zzagtVar9;
        zzagt zzagtVar10 = new zzagt("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzagtVar10;
        zzk = new zzagt[]{zzagtVar, zzagtVar2, zzagtVar3, zzagtVar4, zzagtVar5, zzagtVar6, zzagtVar7, zzagtVar8, zzagtVar9, zzagtVar10};
    }

    private zzagt(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzagt[] values() {
        return (zzagt[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
