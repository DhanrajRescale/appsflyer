package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaa extends zzkt {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzlg zzlgVar) {
        super(zzlgVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i10, int i11) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i10));
        if (zzuVar == null) {
            return false;
        }
        return zzu.zzb(zzuVar).get(i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|(2:4|(2:6|7)(1:521))(2:522|523))|8|(3:10|11|12)|16|(16:(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:496|(1:498)(1:500)|499)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:455|(6:456|457|458|459|460|(1:463)(1:462))|464)|44|(1:46)(6:284|(12:286|287|288|289|290|(6:439|299|300|(3:395|(6:398|(2:434|435)(2:402|(8:408|409|(4:412|(2:414|415)(1:417)|416|410)|418|419|(4:422|(3:424|425|426)(1:428)|427|420)|429|430)(4:404|405|406|407))|431|432|407|396)|437)|302|303)|(4:292|(1:294)|295|296)|299|300|(0)|302|303)(1:454)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|47|(3:179|(4:182|(10:184|185|(1:187)(1:281)|188|(11:190|191|192|193|194|195|196|197|198|199|(4:201|(11:202|203|204|205|206|207|208|(3:210|211|212)(1:254)|213|214|(1:217)(1:216))|218|219)(4:261|262|253|219))(1:280)|220|(4:223|(3:241|242|243)(4:225|226|(2:227|(2:229|(1:231)(2:232|233))(1:240))|(3:235|236|237)(1:239))|238|221)|244|245|246)(1:282)|247|180)|283)|49|50|(3:77|(6:80|(8:82|83|84|85|86|87|88|(3:(9:90|91|92|93|94|(1:96)(1:153)|97|98|(1:101)(1:100))|102|103)(4:160|161|152|103))(1:177)|104|(2:105|(2:107|(3:143|144|145)(6:109|(2:110|(4:112|(3:114|(1:116)(1:139)|117)(1:140)|118|(1:1)(2:122|(1:124)(2:125|126)))(2:141|142))|(2:131|130)|128|129|130))(0))|146|78)|178)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:504|505))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75)|520|36|37|38|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:496|(1:498)(1:500)|499)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:455|(6:456|457|458|459|460|(1:463)(1:462))|464)|44|(1:46)(6:284|(12:286|287|288|289|290|(6:439|299|300|(3:395|(6:398|(2:434|435)(2:402|(8:408|409|(4:412|(2:414|415)(1:417)|416|410)|418|419|(4:422|(3:424|425|426)(1:428)|427|420)|429|430)(4:404|405|406|407))|431|432|407|396)|437)|302|303)|(4:292|(1:294)|295|296)|299|300|(0)|302|303)(1:454)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|47|(3:179|(4:182|(10:184|185|(1:187)(1:281)|188|(11:190|191|192|193|194|195|196|197|198|199|(4:201|(11:202|203|204|205|206|207|208|(3:210|211|212)(1:254)|213|214|(1:217)(1:216))|218|219)(4:261|262|253|219))(1:280)|220|(4:223|(3:241|242|243)(4:225|226|(2:227|(2:229|(1:231)(2:232|233))(1:240))|(3:235|236|237)(1:239))|238|221)|244|245|246)(1:282)|247|180)|283)|49|50|(3:77|(6:80|(8:82|83|84|85|86|87|88|(3:(9:90|91|92|93|94|(1:96)(1:153)|97|98|(1:101)(1:100))|102|103)(4:160|161|152|103))(1:177)|104|(2:105|(2:107|(3:143|144|145)(6:109|(2:110|(4:112|(3:114|(1:116)(1:139)|117)(1:140)|118|(1:1)(2:122|(1:124)(2:125|126)))(2:141|142))|(2:131|130)|128|129|130))(0))|146|78)|178)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:504|505))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0a19, code lost:
    
        r0 = r63.zzt.zzaA().zzk();
        r6 = com.google.android.gms.measurement.internal.zzeu.zzn(r63.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0a2d, code lost:
    
        if (r7.zzj() == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0a2f, code lost:
    
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0a39, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0a38, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0915, code lost:
    
        if (r13 == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x076c, code lost:
    
        if (r5 != null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02f0, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x01be, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x022b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x022c, code lost:
    
        r18 = "audience_id";
        r19 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0234, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0231, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0172, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_LEAVE, TryCatch #18 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:455:0x01c4, B:456:0x01c9, B:458:0x01d3, B:459:0x01e3, B:460:0x020f, B:473:0x01f2, B:476:0x0202, B:479:0x0208, B:467:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01c4 A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_ENTER, TryCatch #18 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:455:0x01c4, B:456:0x01c9, B:458:0x01d3, B:459:0x01e3, B:460:0x020f, B:473:0x01f2, B:476:0x0202, B:479:0x0208, B:467:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0822  */
    /* JADX WARN: Type inference failed for: r0v199, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r0v2, types: [t.j0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v21, types: [t.j0] */
    /* JADX WARN: Type inference failed for: r2v36, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r2v40, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r4v18, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r4v24, types: [t.j0, t.f] */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v49, types: [t.j0] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v1, types: [t.j0, java.util.Map, t.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [t.j0, java.util.Map, t.f] */
    /* JADX WARN: Type inference failed for: r8v36, types: [t.j0, t.f] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zza(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            Method dump skipped, instructions count: 2819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkt
    public final boolean zzb() {
        return false;
    }
}
