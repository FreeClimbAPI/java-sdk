# Java SDK Changelog

All notable changes to this project will be documented in this file.

The format of this changelog is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).
This project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

None

<a name="5.1.3"></a>

## [5.1.3] 2023-03-13

### Changed

- callStatus variable of CallResult is now processing and returning correct data back

<a name="5.1.2"></a>

## [5.1.2] 2023-02-21

### Changed

- OutDial PerCL command callingNumber and destination types fixed

<a name="5.1.1"></a>

## [5.1.1] 2023-02-14

### Changed

- Application Request model allows for null values

<a name="5.1.0"></a>

## [5.1.0] 2023-01-06

### Changed

- Enums have been implemented in the java sdk
- Updated README for enum implementation and testing

<a name="5.0.3"></a>

## [5.0.3] 2022-12-06

### Changed

- Changed QueueResult property currentSize from string to int
- Renamed QueueResult property averageWaitTime to averageQueueRemovalTime

<a name="5.0.2"></a>

## [5.0.2] 2022-11-01

### Added

- Add `offnet` property in IncomingNumber resource
- Add `offnet` query parameter for listIncomingNumbers

<a name="5.0.1"></a>

## [5.0.1] 2022-10-31

### Changed

- Updated gson dependency due to security issues

<a name="5.0.0"></a>

## [5.0.0] 2022-10-27

### Changed

- Java SDK no longer hand written - generated from openapi spec

<a name="4.1.5"></a>

## [4.1.5] 2022-01-18

### Changed

- Fixed typos and build errors

### Added

- Add `capabilities`, `campaignId`, and `provider` to `ListIncomingNumbersFilters` interface
- Add `capabilities`, `campaignId`, and `provider` to `ListAvailableNumbersFilters` interface
- Add `capabilities`, `campaignId`, and `provider` to `AvailableNumber` interface
- Add `capabilities`, `campaignId`, and `provider` to `IncomingNumber` interface

### Removed

- Remove `smsEnabled` and `voiceEnabled` from `ListAvailableNumbersFilters` interface
- Remove `smsEnabled` and `voiceEnabled` from `ListIncomingNumbersFilters` interface
- Remove `smsEnabled` and `voiceEnabled` from `AvailableNumber` interface
- Remove `smsEnabled` and `voiceEnabled` from `IncomingNumber` interface

<a name="4.1.4"></a>

## [4.1.4] 2021-11-29

### Added

- properties `country`, `region`, `smsEnabled`, `voiceEnabled` to `AvailablePhoneNumberSearchFilters`
- properties `applicationId`, `country`, `region`, `smsEnabled`, `voiceEnabled`, `hasApplication` to `IncomingPhoneNumberSearchFilters`

### Removed

- property `alias` of `AvailablePhoneNumberSearchFilters`

<a name="4.1.3"</a>

## [4.1.3] 2021-11-3

### Added

- 1 new property `active` for CallSearchFilters and Call
  <a name="4.1.2"</a>

## [3.0.2] 2021-8-3

### Added

- 4 new properties for GetSpeechActionCallback
  <a name="4.1.1"></a>

## [4.1.1] - 2021-05-11

### Added

- Add `callConnectUrl` option to MakeCall Request

<a name="4.1.0"></a>

## [4.1.0] - 2021-05-10

### Changed

- Replace any language instance of auth_token or similar speech to api_key

<a name="4.0.1"></a>

## [4.0.1] - 2021-05-03

### Fixed

- Fix exception handling within verifyRequest

<a name="4.0.0"></a>

## [4.0.0] - 2021-05-03

### Added

- Add `verifyRequest` utility function

<a name="3.0.3"></a>

## [3.0.3] - 2020-12-16

### Added

- Add `privacyMode` option to RecordUtterance PerCL command

<a name="3.0.2"></a>

## [3.0.2] - 2020-12-16

### Added

- Additional message statuses for TFN functionality

<a name="1.2.1"></a>

## [1.2.1] - 2020-10-14

### Added

- Add `Reject` PerCL command
- Add `privacyMode` option

### Changed

- Rename `setPersyUrl` to `setUrl`

### Fixed

- Properly handle empty response bodies
- Other Minor bug fixes

<a name="1.2"></a>

## [1.2] - 2019-10-16

### Changed

- Persephony is now FreeClimb
- Code cleanup
- Documentation Updates
- Test Update

### Fixed

- Update common response handler to not use bodu twice

<a name="1.1.1"></a>

## [1.1.1] - 2019-06-27

### Changed

- Minor updates to docs and code cleanup

<a name="1.1.0"></a>

## [1.1.0] - 2019-06-07

### Pull Requests

- Merge pull request [#22](https://gitlab.vailsys.com/vail-cloud-services/fc-boilerplates/javascript-sdk/issues/22) from PersephonyAPI/maintenance

<a name="1.0.0"></a>

## [1.0.0] - 2019-06-04

### Changed

- Change default api target

<a name="0.1.0"></a>

## [0.1.0] - 2019-05-30

### Added

- `PlayEarlyMedia` PerCL Command

<a name="0.0.2"></a>

## [0.0.2] - 2018-11-29

### Remove

- Remove `callConnectUrl` and `statusCallbackUrl` from api.calls#create

<a name="0.0.1"></a>

## [0.0.1] - 2018-11-13

### Added

- PerCL Support
- FreeClimb API Support
- README, LICENSE
- docs

### Changed

- Initial Release

[unreleased]: https://github.com/FreeClimbAPI/java-sdk/compare/v1.0.1...HEAD
