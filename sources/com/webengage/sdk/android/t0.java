package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.u;
import com.webengage.sdk.android.utils.Provider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class t0 implements i0<AbstractWebEngage> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f12673a;

    /* renamed from: b, reason: collision with root package name */
    private int f12674b;

    public t0(int i10, Object... objArr) {
        this.f12673a = objArr;
        this.f12674b = i10;
    }

    public void a(AbstractWebEngage abstractWebEngage) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        try {
            switch (this.f12674b) {
                case 0:
                    Object[] objArr = this.f12673a;
                    if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null) {
                        return;
                    }
                    abstractWebEngage.setLocationTracking(((Boolean) obj).booleanValue());
                    return;
                case 1:
                    Object[] objArr2 = this.f12673a;
                    if (objArr2 == null || objArr2.length <= 0 || (obj2 = objArr2[0]) == null) {
                        return;
                    }
                    abstractWebEngage.setLogLevel(((Integer) obj2).intValue());
                    return;
                case 2:
                    Object[] objArr3 = this.f12673a;
                    if (objArr3 == null || objArr3.length <= 0 || (obj3 = objArr3[0]) == null) {
                        return;
                    }
                    abstractWebEngage.setEventReportingStrategy((ReportingStrategy) obj3);
                    return;
                case 3:
                    Object[] objArr4 = this.f12673a;
                    if (objArr4 == null || objArr4.length <= 0 || (obj4 = objArr4[0]) == null) {
                        return;
                    }
                    abstractWebEngage.filterCustomEvents(((Boolean) obj4).booleanValue());
                    return;
                case 4:
                    Object[] objArr5 = this.f12673a;
                    if (objArr5 == null || objArr5.length <= 0 || (obj5 = objArr5[0]) == null) {
                        return;
                    }
                    abstractWebEngage.setEveryActivityIsScreen(((Boolean) obj5).booleanValue());
                    return;
                case 5:
                    Object[] objArr6 = this.f12673a;
                    String str = objArr6.length > 0 ? (String) objArr6[0] : null;
                    if (objArr6.length > 1) {
                    }
                    String str2 = objArr6.length > 2 ? (String) objArr6[2] : null;
                    Logger.d("WebEngage", "Inside SET_REGISTRATION_ID with provider: " + str2 + " token: " + str);
                    if (Provider.FCM.name().equalsIgnoreCase(str2)) {
                        abstractWebEngage.setRegistrationID(str);
                        return;
                    } else if (Provider.MI.name().equalsIgnoreCase(str2)) {
                        abstractWebEngage.setXiaomiRegistrationID(str);
                        return;
                    } else {
                        if (Provider.HW.name().equalsIgnoreCase(str2)) {
                            abstractWebEngage.setHuaweiRegistrationID(str);
                            return;
                        }
                        return;
                    }
                case 6:
                    Object[] objArr7 = this.f12673a;
                    if (objArr7 == null || objArr7.length <= 0 || (obj6 = objArr7[0]) == null) {
                        return;
                    }
                    abstractWebEngage.a((Intent) obj6);
                    return;
                case 7:
                    Object[] objArr8 = this.f12673a;
                    if (objArr8 == null || objArr8.length <= 0 || (obj7 = objArr8[0]) == null) {
                        return;
                    }
                    abstractWebEngage.a((Intent) obj7, (BroadcastReceiver) null);
                    return;
                case 8:
                    Object[] objArr9 = this.f12673a;
                    if (objArr9 == null || objArr9.length <= 0 || (obj8 = objArr9[0]) == null) {
                        return;
                    }
                    abstractWebEngage.a((Location) obj8, (BroadcastReceiver) null);
                    return;
                case 9:
                    abstractWebEngage.e(null);
                    return;
                case 10:
                    abstractWebEngage.c((BroadcastReceiver) null);
                    return;
                case 11:
                    abstractWebEngage.b((BroadcastReceiver) null);
                    return;
                case 12:
                    Object[] objArr10 = this.f12673a;
                    if (objArr10 == null || objArr10.length <= 0 || (obj9 = objArr10[0]) == null) {
                        return;
                    }
                    abstractWebEngage.c((Intent) obj9, null);
                    return;
                case 13:
                    Object[] objArr11 = this.f12673a;
                    if (objArr11 == null || objArr11.length <= 0 || (obj10 = objArr11[0]) == null) {
                        return;
                    }
                    abstractWebEngage.b((Intent) obj10, null);
                    return;
                case 14:
                    Object[] objArr12 = this.f12673a;
                    if (objArr12 == null || objArr12.length <= 0 || (obj11 = objArr12[0]) == null) {
                        return;
                    }
                    abstractWebEngage.b((Intent) obj11);
                    return;
                case 15:
                    Object[] objArr13 = this.f12673a;
                    if (objArr13 == null || objArr13.length <= 0 || (obj12 = objArr13[0]) == null) {
                        return;
                    }
                    abstractWebEngage.a((u.a) obj12, (BroadcastReceiver) null);
                    return;
                case 16:
                    abstractWebEngage.f(null);
                    return;
                case 17:
                    Object[] objArr14 = this.f12673a;
                    if (objArr14 == null || objArr14.length <= 0 || (obj13 = objArr14[0]) == null) {
                        return;
                    }
                    abstractWebEngage.c((Intent) obj13);
                    return;
                case 18:
                default:
                    return;
                case 19:
                    Object[] objArr15 = this.f12673a;
                    if (objArr15 == null || objArr15.length <= 0 || (obj14 = objArr15[0]) == null || !(obj14 instanceof LocationTrackingStrategy)) {
                        return;
                    }
                    abstractWebEngage.setLocationTrackingStrategy((LocationTrackingStrategy) obj14);
                    return;
                case 20:
                    abstractWebEngage.d(null);
                    return;
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while executing queued task of WebEngage: " + e10.toString());
        }
    }
}
