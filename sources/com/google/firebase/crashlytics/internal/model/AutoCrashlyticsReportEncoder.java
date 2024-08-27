package com.google.firebase.crashlytics.internal.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import fq.c;
import fq.d;
import fq.e;
import gq.a;
import gq.b;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AutoCrashlyticsReportEncoder implements a {
    public static final int CODEGEN_VERSION = 2;
    public static final a CONFIG = new AutoCrashlyticsReportEncoder();

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements d {
        static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        private static final c ARCH_DESCRIPTOR = c.b("arch");
        private static final c LIBRARYNAME_DESCRIPTOR = c.b("libraryName");
        private static final c BUILDID_DESCRIPTOR = c.b("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, e eVar) throws IOException {
            eVar.d(ARCH_DESCRIPTOR, buildIdMappingForArch.getArch());
            eVar.d(LIBRARYNAME_DESCRIPTOR, buildIdMappingForArch.getLibraryName());
            eVar.d(BUILDID_DESCRIPTOR, buildIdMappingForArch.getBuildId());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportApplicationExitInfoEncoder implements d {
        static final CrashlyticsReportApplicationExitInfoEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoEncoder();
        private static final c PID_DESCRIPTOR = c.b("pid");
        private static final c PROCESSNAME_DESCRIPTOR = c.b("processName");
        private static final c REASONCODE_DESCRIPTOR = c.b("reasonCode");
        private static final c IMPORTANCE_DESCRIPTOR = c.b("importance");
        private static final c PSS_DESCRIPTOR = c.b("pss");
        private static final c RSS_DESCRIPTOR = c.b("rss");
        private static final c TIMESTAMP_DESCRIPTOR = c.b(PaymentConstants.TIMESTAMP);
        private static final c TRACEFILE_DESCRIPTOR = c.b("traceFile");
        private static final c BUILDIDMAPPINGFORARCH_DESCRIPTOR = c.b("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, e eVar) throws IOException {
            eVar.c(PID_DESCRIPTOR, applicationExitInfo.getPid());
            eVar.d(PROCESSNAME_DESCRIPTOR, applicationExitInfo.getProcessName());
            eVar.c(REASONCODE_DESCRIPTOR, applicationExitInfo.getReasonCode());
            eVar.c(IMPORTANCE_DESCRIPTOR, applicationExitInfo.getImportance());
            eVar.b(PSS_DESCRIPTOR, applicationExitInfo.getPss());
            eVar.b(RSS_DESCRIPTOR, applicationExitInfo.getRss());
            eVar.b(TIMESTAMP_DESCRIPTOR, applicationExitInfo.getTimestamp());
            eVar.d(TRACEFILE_DESCRIPTOR, applicationExitInfo.getTraceFile());
            eVar.d(BUILDIDMAPPINGFORARCH_DESCRIPTOR, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportCustomAttributeEncoder implements d {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = new CrashlyticsReportCustomAttributeEncoder();
        private static final c KEY_DESCRIPTOR = c.b("key");
        private static final c VALUE_DESCRIPTOR = c.b(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, e eVar) throws IOException {
            eVar.d(KEY_DESCRIPTOR, customAttribute.getKey());
            eVar.d(VALUE_DESCRIPTOR, customAttribute.getValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportEncoder implements d {
        static final CrashlyticsReportEncoder INSTANCE = new CrashlyticsReportEncoder();
        private static final c SDKVERSION_DESCRIPTOR = c.b(PaymentConstants.SDK_VERSION);
        private static final c GMPAPPID_DESCRIPTOR = c.b("gmpAppId");
        private static final c PLATFORM_DESCRIPTOR = c.b("platform");
        private static final c INSTALLATIONUUID_DESCRIPTOR = c.b("installationUuid");
        private static final c BUILDVERSION_DESCRIPTOR = c.b("buildVersion");
        private static final c DISPLAYVERSION_DESCRIPTOR = c.b("displayVersion");
        private static final c SESSION_DESCRIPTOR = c.b("session");
        private static final c NDKPAYLOAD_DESCRIPTOR = c.b("ndkPayload");
        private static final c APPEXITINFO_DESCRIPTOR = c.b("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport crashlyticsReport, e eVar) throws IOException {
            eVar.d(SDKVERSION_DESCRIPTOR, crashlyticsReport.getSdkVersion());
            eVar.d(GMPAPPID_DESCRIPTOR, crashlyticsReport.getGmpAppId());
            eVar.c(PLATFORM_DESCRIPTOR, crashlyticsReport.getPlatform());
            eVar.d(INSTALLATIONUUID_DESCRIPTOR, crashlyticsReport.getInstallationUuid());
            eVar.d(BUILDVERSION_DESCRIPTOR, crashlyticsReport.getBuildVersion());
            eVar.d(DISPLAYVERSION_DESCRIPTOR, crashlyticsReport.getDisplayVersion());
            eVar.d(SESSION_DESCRIPTOR, crashlyticsReport.getSession());
            eVar.d(NDKPAYLOAD_DESCRIPTOR, crashlyticsReport.getNdkPayload());
            eVar.d(APPEXITINFO_DESCRIPTOR, crashlyticsReport.getAppExitInfo());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportFilesPayloadEncoder implements d {
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = new CrashlyticsReportFilesPayloadEncoder();
        private static final c FILES_DESCRIPTOR = c.b("files");
        private static final c ORGID_DESCRIPTOR = c.b("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.FilesPayload filesPayload, e eVar) throws IOException {
            eVar.d(FILES_DESCRIPTOR, filesPayload.getFiles());
            eVar.d(ORGID_DESCRIPTOR, filesPayload.getOrgId());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportFilesPayloadFileEncoder implements d {
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new CrashlyticsReportFilesPayloadFileEncoder();
        private static final c FILENAME_DESCRIPTOR = c.b("filename");
        private static final c CONTENTS_DESCRIPTOR = c.b("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.FilesPayload.File file, e eVar) throws IOException {
            eVar.d(FILENAME_DESCRIPTOR, file.getFilename());
            eVar.d(CONTENTS_DESCRIPTOR, file.getContents());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionApplicationEncoder implements d {
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = new CrashlyticsReportSessionApplicationEncoder();
        private static final c IDENTIFIER_DESCRIPTOR = c.b("identifier");
        private static final c VERSION_DESCRIPTOR = c.b("version");
        private static final c DISPLAYVERSION_DESCRIPTOR = c.b("displayVersion");
        private static final c ORGANIZATION_DESCRIPTOR = c.b("organization");
        private static final c INSTALLATIONUUID_DESCRIPTOR = c.b("installationUuid");
        private static final c DEVELOPMENTPLATFORM_DESCRIPTOR = c.b("developmentPlatform");
        private static final c DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = c.b("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Application application, e eVar) throws IOException {
            eVar.d(IDENTIFIER_DESCRIPTOR, application.getIdentifier());
            eVar.d(VERSION_DESCRIPTOR, application.getVersion());
            eVar.d(DISPLAYVERSION_DESCRIPTOR, application.getDisplayVersion());
            eVar.d(ORGANIZATION_DESCRIPTOR, application.getOrganization());
            eVar.d(INSTALLATIONUUID_DESCRIPTOR, application.getInstallationUuid());
            eVar.d(DEVELOPMENTPLATFORM_DESCRIPTOR, application.getDevelopmentPlatform());
            eVar.d(DEVELOPMENTPLATFORMVERSION_DESCRIPTOR, application.getDevelopmentPlatformVersion());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements d {
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new CrashlyticsReportSessionApplicationOrganizationEncoder();
        private static final c CLSID_DESCRIPTOR = c.b("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Application.Organization organization, e eVar) throws IOException {
            eVar.d(CLSID_DESCRIPTOR, organization.getClsId());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionDeviceEncoder implements d {
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = new CrashlyticsReportSessionDeviceEncoder();
        private static final c ARCH_DESCRIPTOR = c.b("arch");
        private static final c MODEL_DESCRIPTOR = c.b("model");
        private static final c CORES_DESCRIPTOR = c.b("cores");
        private static final c RAM_DESCRIPTOR = c.b("ram");
        private static final c DISKSPACE_DESCRIPTOR = c.b("diskSpace");
        private static final c SIMULATOR_DESCRIPTOR = c.b("simulator");
        private static final c STATE_DESCRIPTOR = c.b("state");
        private static final c MANUFACTURER_DESCRIPTOR = c.b("manufacturer");
        private static final c MODELCLASS_DESCRIPTOR = c.b("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Device device, e eVar) throws IOException {
            eVar.c(ARCH_DESCRIPTOR, device.getArch());
            eVar.d(MODEL_DESCRIPTOR, device.getModel());
            eVar.c(CORES_DESCRIPTOR, device.getCores());
            eVar.b(RAM_DESCRIPTOR, device.getRam());
            eVar.b(DISKSPACE_DESCRIPTOR, device.getDiskSpace());
            eVar.a(SIMULATOR_DESCRIPTOR, device.isSimulator());
            eVar.c(STATE_DESCRIPTOR, device.getState());
            eVar.d(MANUFACTURER_DESCRIPTOR, device.getManufacturer());
            eVar.d(MODELCLASS_DESCRIPTOR, device.getModelClass());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEncoder implements d {
        static final CrashlyticsReportSessionEncoder INSTANCE = new CrashlyticsReportSessionEncoder();
        private static final c GENERATOR_DESCRIPTOR = c.b("generator");
        private static final c IDENTIFIER_DESCRIPTOR = c.b("identifier");
        private static final c STARTEDAT_DESCRIPTOR = c.b("startedAt");
        private static final c ENDEDAT_DESCRIPTOR = c.b("endedAt");
        private static final c CRASHED_DESCRIPTOR = c.b("crashed");
        private static final c APP_DESCRIPTOR = c.b("app");
        private static final c USER_DESCRIPTOR = c.b(LogSubCategory.Action.USER);
        private static final c OS_DESCRIPTOR = c.b("os");
        private static final c DEVICE_DESCRIPTOR = c.b(LogSubCategory.Context.DEVICE);
        private static final c EVENTS_DESCRIPTOR = c.b("events");
        private static final c GENERATORTYPE_DESCRIPTOR = c.b("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session session, e eVar) throws IOException {
            eVar.d(GENERATOR_DESCRIPTOR, session.getGenerator());
            eVar.d(IDENTIFIER_DESCRIPTOR, session.getIdentifierUtf8Bytes());
            eVar.b(STARTEDAT_DESCRIPTOR, session.getStartedAt());
            eVar.d(ENDEDAT_DESCRIPTOR, session.getEndedAt());
            eVar.a(CRASHED_DESCRIPTOR, session.isCrashed());
            eVar.d(APP_DESCRIPTOR, session.getApp());
            eVar.d(USER_DESCRIPTOR, session.getUser());
            eVar.d(OS_DESCRIPTOR, session.getOs());
            eVar.d(DEVICE_DESCRIPTOR, session.getDevice());
            eVar.d(EVENTS_DESCRIPTOR, session.getEvents());
            eVar.c(GENERATORTYPE_DESCRIPTOR, session.getGeneratorType());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationEncoder();
        private static final c EXECUTION_DESCRIPTOR = c.b("execution");
        private static final c CUSTOMATTRIBUTES_DESCRIPTOR = c.b("customAttributes");
        private static final c INTERNALKEYS_DESCRIPTOR = c.b("internalKeys");
        private static final c BACKGROUND_DESCRIPTOR = c.b("background");
        private static final c UIORIENTATION_DESCRIPTOR = c.b("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application application, e eVar) throws IOException {
            eVar.d(EXECUTION_DESCRIPTOR, application.getExecution());
            eVar.d(CUSTOMATTRIBUTES_DESCRIPTOR, application.getCustomAttributes());
            eVar.d(INTERNALKEYS_DESCRIPTOR, application.getInternalKeys());
            eVar.d(BACKGROUND_DESCRIPTOR, application.getBackground());
            eVar.c(UIORIENTATION_DESCRIPTOR, application.getUiOrientation());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();
        private static final c BASEADDRESS_DESCRIPTOR = c.b("baseAddress");
        private static final c SIZE_DESCRIPTOR = c.b("size");
        private static final c NAME_DESCRIPTOR = c.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
        private static final c UUID_DESCRIPTOR = c.b("uuid");

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, e eVar) throws IOException {
            eVar.b(BASEADDRESS_DESCRIPTOR, binaryImage.getBaseAddress());
            eVar.b(SIZE_DESCRIPTOR, binaryImage.getSize());
            eVar.d(NAME_DESCRIPTOR, binaryImage.getName());
            eVar.d(UUID_DESCRIPTOR, binaryImage.getUuidUtf8Bytes());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionEncoder();
        private static final c THREADS_DESCRIPTOR = c.b("threads");
        private static final c EXCEPTION_DESCRIPTOR = c.b("exception");
        private static final c APPEXITINFO_DESCRIPTOR = c.b("appExitInfo");
        private static final c SIGNAL_DESCRIPTOR = c.b("signal");
        private static final c BINARIES_DESCRIPTOR = c.b("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, e eVar) throws IOException {
            eVar.d(THREADS_DESCRIPTOR, execution.getThreads());
            eVar.d(EXCEPTION_DESCRIPTOR, execution.getException());
            eVar.d(APPEXITINFO_DESCRIPTOR, execution.getAppExitInfo());
            eVar.d(SIGNAL_DESCRIPTOR, execution.getSignal());
            eVar.d(BINARIES_DESCRIPTOR, execution.getBinaries());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();
        private static final c TYPE_DESCRIPTOR = c.b("type");
        private static final c REASON_DESCRIPTOR = c.b("reason");
        private static final c FRAMES_DESCRIPTOR = c.b("frames");
        private static final c CAUSEDBY_DESCRIPTOR = c.b("causedBy");
        private static final c OVERFLOWCOUNT_DESCRIPTOR = c.b("overflowCount");

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, e eVar) throws IOException {
            eVar.d(TYPE_DESCRIPTOR, exception.getType());
            eVar.d(REASON_DESCRIPTOR, exception.getReason());
            eVar.d(FRAMES_DESCRIPTOR, exception.getFrames());
            eVar.d(CAUSEDBY_DESCRIPTOR, exception.getCausedBy());
            eVar.c(OVERFLOWCOUNT_DESCRIPTOR, exception.getOverflowCount());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        private static final c NAME_DESCRIPTOR = c.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
        private static final c CODE_DESCRIPTOR = c.b("code");
        private static final c ADDRESS_DESCRIPTOR = c.b("address");

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, e eVar) throws IOException {
            eVar.d(NAME_DESCRIPTOR, signal.getName());
            eVar.d(CODE_DESCRIPTOR, signal.getCode());
            eVar.b(ADDRESS_DESCRIPTOR, signal.getAddress());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        private static final c NAME_DESCRIPTOR = c.b(AppMeasurementSdk.ConditionalUserProperty.NAME);
        private static final c IMPORTANCE_DESCRIPTOR = c.b("importance");
        private static final c FRAMES_DESCRIPTOR = c.b("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, e eVar) throws IOException {
            eVar.d(NAME_DESCRIPTOR, thread.getName());
            eVar.c(IMPORTANCE_DESCRIPTOR, thread.getImportance());
            eVar.d(FRAMES_DESCRIPTOR, thread.getFrames());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements d {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();
        private static final c PC_DESCRIPTOR = c.b("pc");
        private static final c SYMBOL_DESCRIPTOR = c.b("symbol");
        private static final c FILE_DESCRIPTOR = c.b("file");
        private static final c OFFSET_DESCRIPTOR = c.b("offset");
        private static final c IMPORTANCE_DESCRIPTOR = c.b("importance");

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, e eVar) throws IOException {
            eVar.b(PC_DESCRIPTOR, frame.getPc());
            eVar.d(SYMBOL_DESCRIPTOR, frame.getSymbol());
            eVar.d(FILE_DESCRIPTOR, frame.getFile());
            eVar.b(OFFSET_DESCRIPTOR, frame.getOffset());
            eVar.c(IMPORTANCE_DESCRIPTOR, frame.getImportance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventDeviceEncoder implements d {
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new CrashlyticsReportSessionEventDeviceEncoder();
        private static final c BATTERYLEVEL_DESCRIPTOR = c.b("batteryLevel");
        private static final c BATTERYVELOCITY_DESCRIPTOR = c.b("batteryVelocity");
        private static final c PROXIMITYON_DESCRIPTOR = c.b("proximityOn");
        private static final c ORIENTATION_DESCRIPTOR = c.b("orientation");
        private static final c RAMUSED_DESCRIPTOR = c.b("ramUsed");
        private static final c DISKUSED_DESCRIPTOR = c.b("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Device device, e eVar) throws IOException {
            eVar.d(BATTERYLEVEL_DESCRIPTOR, device.getBatteryLevel());
            eVar.c(BATTERYVELOCITY_DESCRIPTOR, device.getBatteryVelocity());
            eVar.a(PROXIMITYON_DESCRIPTOR, device.isProximityOn());
            eVar.c(ORIENTATION_DESCRIPTOR, device.getOrientation());
            eVar.b(RAMUSED_DESCRIPTOR, device.getRamUsed());
            eVar.b(DISKUSED_DESCRIPTOR, device.getDiskUsed());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventEncoder implements d {
        static final CrashlyticsReportSessionEventEncoder INSTANCE = new CrashlyticsReportSessionEventEncoder();
        private static final c TIMESTAMP_DESCRIPTOR = c.b(PaymentConstants.TIMESTAMP);
        private static final c TYPE_DESCRIPTOR = c.b("type");
        private static final c APP_DESCRIPTOR = c.b("app");
        private static final c DEVICE_DESCRIPTOR = c.b(LogSubCategory.Context.DEVICE);
        private static final c LOG_DESCRIPTOR = c.b("log");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event event, e eVar) throws IOException {
            eVar.b(TIMESTAMP_DESCRIPTOR, event.getTimestamp());
            eVar.d(TYPE_DESCRIPTOR, event.getType());
            eVar.d(APP_DESCRIPTOR, event.getApp());
            eVar.d(DEVICE_DESCRIPTOR, event.getDevice());
            eVar.d(LOG_DESCRIPTOR, event.getLog());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionEventLogEncoder implements d {
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = new CrashlyticsReportSessionEventLogEncoder();
        private static final c CONTENT_DESCRIPTOR = c.b("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.Event.Log log, e eVar) throws IOException {
            eVar.d(CONTENT_DESCRIPTOR, log.getContent());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements d {
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new CrashlyticsReportSessionOperatingSystemEncoder();
        private static final c PLATFORM_DESCRIPTOR = c.b("platform");
        private static final c VERSION_DESCRIPTOR = c.b("version");
        private static final c BUILDVERSION_DESCRIPTOR = c.b("buildVersion");
        private static final c JAILBROKEN_DESCRIPTOR = c.b("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, e eVar) throws IOException {
            eVar.c(PLATFORM_DESCRIPTOR, operatingSystem.getPlatform());
            eVar.d(VERSION_DESCRIPTOR, operatingSystem.getVersion());
            eVar.d(BUILDVERSION_DESCRIPTOR, operatingSystem.getBuildVersion());
            eVar.a(JAILBROKEN_DESCRIPTOR, operatingSystem.isJailbroken());
        }
    }

    /* loaded from: classes2.dex */
    public static final class CrashlyticsReportSessionUserEncoder implements d {
        static final CrashlyticsReportSessionUserEncoder INSTANCE = new CrashlyticsReportSessionUserEncoder();
        private static final c IDENTIFIER_DESCRIPTOR = c.b("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // fq.b
        public void encode(CrashlyticsReport.Session.User user, e eVar) throws IOException {
            eVar.d(IDENTIFIER_DESCRIPTOR, user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // gq.a
    public void configure(b bVar) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.class, crashlyticsReportEncoder);
        bVar.a(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        bVar.a(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        bVar.a(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        bVar.a(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        bVar.a(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        bVar.a(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.INSTANCE;
        bVar.a(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        bVar.a(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
